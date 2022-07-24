import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.sprint_4.POM.HomePageScooterPOM;

import static ru.yandex.praktikum.sprint_4.data.URLAddress.YANDEX_SCOOTER_URL;

public class TestYandexScooterFAQFirefox {

    private WebDriver driver;
    private HomePageScooterPOM objHomePageScooter;

    @Before
    public void before() {
        driver = new FirefoxDriver();
        driver.get(YANDEX_SCOOTER_URL);
        driver.manage().window().maximize();
        objHomePageScooter = new HomePageScooterPOM(driver);
    }

    @Test
    public void testHomePageScooterFAQ1Firefox() {
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.getFaq1Question());
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.getFaq1Answer());
    }

    @Test
    public void testHomePageScooterFAQ2Firefox() {
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.getFaq2Question());
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.getFaq2Answer());
    }

    @Test
    public void testHomePageScooterFAQ3Firefox() {
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.getFaq3Question());
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.getFaq3Answer());
    }

    @Test
    public void testHomePageScooterFAQ4Firefox() {
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.getFaq4Question());
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.getFaq4Answer());
    }

    @Test
    public void testHomePageScooterFAQ5Firefox() {
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.getFaq5Question());
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.getFaq5Answer());
    }

    @Test
    public void testHomePageScooterFAQ6Firefox() {
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.getFaq6Question());
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.getFaq6Answer());
    }

    @Test
    public void testHomePageScooterFAQ7Firefox() {
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.getFaq7Question());
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.getFaq7Answer());
    }

    @Test
    public void testHomePageScooterFAQ8Firefox() {
        objHomePageScooter.waitForLoadHomePageFAQ();
        objHomePageScooter.clickFaqQuestion(objHomePageScooter.getFaq8Question());
        objHomePageScooter.isDisplayedFaqQuestion(objHomePageScooter.getFaq8Answer());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
