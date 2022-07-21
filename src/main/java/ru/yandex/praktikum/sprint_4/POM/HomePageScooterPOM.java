package ru.yandex.praktikum.sprint_4.POM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageScooterPOM {

    private WebDriver driver;

    public By faq1Question = By.id("accordion__heading-0");
    public By faq1Answer = By.id("accordion__panel-0");
    public By faq2Question = By.id("accordion__heading-1");
    public By faq2Answer = By.id("accordion__panel-1");
    public By faq3Question = By.id("accordion__heading-2");
    public By faq3Answer = By.id("accordion__panel-2");
    public By faq4Question = By.id("accordion__heading-3");
    public By faq4Answer = By.id("accordion__panel-3");
    public By faq5Question = By.id("accordion__heading-4");
    public By faq5Answer = By.id("accordion__panel-4");
    public By faq6Question = By.id("accordion__heading-5");
    public By faq6Answer = By.id("accordion__panel-5");
    public By faq7Question = By.id("accordion__heading-6");
    public By faq7Answer = By.id("accordion__panel-6");
    public By faq8Question = By.id("accordion__heading-7");
    public By faq8Answer = By.id("accordion__panel-7");
    private By orderHeaderButton = By.xpath("//button[not(contains(@class, 'Middle')) and text()='Заказать']");
    private By orderMiddleButton = By.xpath("//button[contains(@class, 'Middle') and text()='Заказать']");

    public HomePageScooterPOM(WebDriver driver){
        this.driver = driver;
    }

    public void clickFaqQuestion(By question) {
        driver.findElement(question).click();
    }

    public void isDisplayedFaqQuestion(By answer) {
        WebElement element = driver.findElement(answer);
        Assert.assertTrue(element.isDisplayed());
    }

    private void scrollToBottomPage() {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void waitForLoadHomePageFAQ() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faq8Question));
        scrollToBottomPage();
    }

    public void waitForLoadHomePageHeaderButton() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(orderHeaderButton));
    }

    private void scrollToCenterPage() {
        WebElement element = driver.findElement(orderMiddleButton);
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor)driver).executeScript(scrollElementIntoMiddle, element);
    }

    public void waitForLoadHomePageMiddleButton() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(orderMiddleButton));
        scrollToCenterPage();
    }

    public void clickHomePageHeaderButton() {
        driver.findElement(orderHeaderButton).click();
    }

    public void clickHomePageMiddleButton() {
        driver.findElement(orderMiddleButton).click();
    }
}
