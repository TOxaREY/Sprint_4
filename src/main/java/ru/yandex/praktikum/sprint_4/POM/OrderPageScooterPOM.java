package ru.yandex.praktikum.sprint_4.POM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPageScooterPOM {

    private WebDriver driver;
    private By nameField = By.xpath("//input[@placeholder='* Имя']");
    private By surnameField = By.xpath("//input[@placeholder='* Фамилия']");
    private By addressField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStationSelect = By.xpath("//input[@placeholder='* Станция метро']");
    private By telephoneNumberField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath("//button[text()='Далее']");
    private By dateField = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By rentalPeriodSelect = By.xpath("//div[@class='Dropdown-placeholder']");
    private By orderFormButton = By.xpath("//button[contains(@class, 'Middle') and text()='Заказать']");
    private By yesButton = By.xpath("//button[contains(@class, 'Middle') and text()='Да']");
    private By textOrderIsProcessed = By.xpath("//div[contains(@class, 'Order_ModalHeader') and text()='Заказ оформлен']");

    public OrderPageScooterPOM(WebDriver driver){
        this.driver = driver;
    }

    private void waitForLoadOrderPage() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(nameField));
    }

    private void setNameField(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    private void setSurnameField(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    private void setAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    private void setMetroStationSelect(String metroStation) {
        driver.findElement(metroStationSelect).sendKeys(metroStation);
        driver.findElement(metroStationSelect).sendKeys(Keys.chord(Keys.ALT, Keys.ARROW_DOWN));
        driver.findElement(metroStationSelect).sendKeys(Keys.ENTER);
    }

    private void setTelephoneNumberField(String telephoneNumber) {
        driver.findElement(telephoneNumberField).sendKeys(telephoneNumber);
    }

    private void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    private void waitForLoadContinuationForm() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(dateField));
    }
    //Дата в формате 01.01.2000
    private void setDateField(String date) {
        driver.findElement(dateField).sendKeys(date);
        driver.findElement(dateField).sendKeys(Keys.ENTER);
    }

    private void clickRentalPeriodSelect() {
        driver.findElement(rentalPeriodSelect).click();
    }
    //Число от 1 до 7 (дней)
    private void selectRentalPeriodList(int days) {
        String textDays;
        switch (days) {
            case(1): textDays = "сутки";
                break;
            case(2): textDays = "двое суток";
                break;
            case(3): textDays = "трое суток";
                break;
            case(4): textDays = "четверо суток";
                break;
            case(5): textDays = "пятеро суток";
                break;
            case(6): textDays = "шестеро суток";
                break;
            default: textDays = "семеро суток";
                break;
        }
        String xpath = "//div[@class='Dropdown-option' and text()='" + textDays + "']";
        By rentalPeriodList = By.xpath(xpath);
        driver.findElement(rentalPeriodList).click();
    }

    private void clickOrderFormButton() {
        driver.findElement(orderFormButton).click();
    }

    private void waitForLoadPopUpWindowOrderComfirm() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(yesButton));
    }

    private void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    private void waitForLoadPopUpWindowOrderComplete() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(textOrderIsProcessed));
    }

    private void orderForm(String name,
                           String surname,
                           String address,
                           String metroStation,
                           String telephoneNumber,
                           String date,
                           int days) {
        waitForLoadOrderPage();
        setNameField(name);
        setSurnameField(surname);
        setAddressField(address);
        setMetroStationSelect(metroStation);
        setTelephoneNumberField(telephoneNumber);
        clickNextButton();
        waitForLoadContinuationForm();
        setDateField(date);
        clickRentalPeriodSelect();
        selectRentalPeriodList(days);
        clickOrderFormButton();
        waitForLoadPopUpWindowOrderComfirm();
        clickYesButton();
        waitForLoadPopUpWindowOrderComplete();
    }

    public void orderUsingHeaderButton(
            WebDriver driver,
            String name,
            String surname,
            String address,
            String metroStation,
            String telephoneNumber,
            String date,
            int days) {
        HomePageScooterPOM objHomePageScooterPOM = new HomePageScooterPOM(driver);
        objHomePageScooterPOM.waitForLoadHomePageHeaderButton();
        objHomePageScooterPOM.clickHomePageHeaderButton();
        orderForm(name, surname, address, metroStation, telephoneNumber,date, days);
    }

    public void orderUsingMiddleButton(
            WebDriver driver,
            String name,
            String surname,
            String address,
            String metroStation,
            String telephoneNumber,
            String date,
            int days) {
        HomePageScooterPOM objHomePageScooterPOM = new HomePageScooterPOM(driver);
        objHomePageScooterPOM.waitForLoadHomePageMiddleButton();
        objHomePageScooterPOM.clickHomePageMiddleButton();
        orderForm(name, surname, address, metroStation, telephoneNumber,date, days);
    }
}
