import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.sprint_4.POM.HomePageScooterPOM;

public class TestYandexScooterFAQChrome {

    private WebDriver driver;

    @Test
    public void testHomePageScooterFAQ1Chrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq1Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq1Answer);
    }

    @Test
    public void testHomePageScooterFAQ2Chrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq2Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq2Answer);
    }

    @Test
    public void testHomePageScooterFAQ3Chrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq3Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq3Answer);
    }

    @Test
    public void testHomePageScooterFAQ4Chrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq4Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq4Answer);
    }

    @Test
    public void testHomePageScooterFAQ5Chrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq5Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq5Answer);
    }

    @Test
    public void testHomePageScooterFAQ6Chrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq6Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq6Answer);
    }

    @Test
    public void testHomePageScooterFAQ7Chrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooterPOM objHomePageScooter = new HomePageScooterPOM(driver);
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.faq7Question);
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.faq7Answer);
    }

    @Test
    public void testHomePageScooterFAQ8Chrome() {
        driver = new ChromeDriver();
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
