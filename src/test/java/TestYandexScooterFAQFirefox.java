import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.sprint_4.POM.HomePageScooterPOM;

public class TestYandexScooterFAQFirefox {

    private WebDriver driver;

    @Test
    public void testHomePageScooterFAQ1Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq1Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq1Answer);
    }

    @Test
    public void testHomePageScooterFAQ2Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq2Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq2Answer);
    }

    @Test
    public void testHomePageScooterFAQ3Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq3Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq3Answer);
    }

    @Test
    public void testHomePageScooterFAQ4Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq4Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq4Answer);
    }

    @Test
    public void testHomePageScooterFAQ5Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq5Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq5Answer);
    }

    @Test
    public void testHomePageScooterFAQ6Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq6Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq6Answer);
    }

    @Test
    public void testHomePageScooterFAQ7Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq7Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq7Answer);
    }

    @Test
    public void testHomePageScooterFAQ8Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq8Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq8Answer);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
