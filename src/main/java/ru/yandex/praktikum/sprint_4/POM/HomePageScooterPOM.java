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

    private By faq1Question = By.id("accordion__heading-0");
    private By faq1Answer = By.id("accordion__panel-0");
    private By faq2Question = By.id("accordion__heading-1");
    private By faq2Answer = By.id("accordion__panel-1");
    private By faq3Question = By.id("accordion__heading-2");
    private By faq3Answer = By.id("accordion__panel-2");
    private By faq4Question = By.id("accordion__heading-3");
    private By faq4Answer = By.id("accordion__panel-3");
    private By faq5Question = By.id("accordion__heading-4");
    private By faq5Answer = By.id("accordion__panel-4");
    private By faq6Question = By.id("accordion__heading-5");
    private By faq6Answer = By.id("accordion__panel-5");
    private By faq7Question = By.id("accordion__heading-6");
    private By faq7Answer = By.id("accordion__panel-6");
    private By faq8Question = By.id("accordion__heading-7");
    private By faq8Answer = By.id("accordion__panel-7");
    private By orderHeaderButton = By.xpath("//button[not(contains(@class, 'Middle')) and text()='Заказать']");
    private By orderMiddleButton = By.xpath("//button[contains(@class, 'Middle') and text()='Заказать']");

    public HomePageScooterPOM(WebDriver driver){
        this.driver = driver;
    }

    public By getFaq1Question() {
        return faq1Question;
    }

    public By getFaq1Answer() {
        return faq1Answer;
    }

    public By getFaq2Question() {
        return faq2Question;
    }

    public By getFaq2Answer() {
        return faq2Answer;
    }

    public By getFaq3Question() {
        return faq3Question;
    }

    public By getFaq3Answer() {
        return faq3Answer;
    }

    public By getFaq4Question() {
        return faq4Question;
    }

    public By getFaq4Answer() {
        return faq4Answer;
    }

    public By getFaq5Question() {
        return faq5Question;
    }

    public By getFaq5Answer() {
        return faq5Answer;
    }

    public By getFaq6Question() {
        return faq6Question;
    }

    public By getFaq6Answer() {
        return faq6Answer;
    }

    public By getFaq7Question() {
        return faq7Question;
    }

    public By getFaq7Answer() {
        return faq7Answer;
    }

    public By getFaq8Question() {
        return faq8Question;
    }

    public By getFaq8Answer() {
        return faq8Answer;
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
