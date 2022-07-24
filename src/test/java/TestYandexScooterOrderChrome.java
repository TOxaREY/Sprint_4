import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.sprint_4.POM.HomePageScooterPOM;
import ru.yandex.praktikum.sprint_4.POM.OrderPageScooterPOM;
import ru.yandex.praktikum.sprint_4.data.Customer;
import ru.yandex.praktikum.sprint_4.data.Order;

import static ru.yandex.praktikum.sprint_4.data.URLAddress.YANDEX_SCOOTER_URL;

public class TestYandexScooterOrderChrome {

    private WebDriver driver;
    private HomePageScooterPOM objHomePageScooter;
    private OrderPageScooterPOM objOrderPageScooter;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.get(YANDEX_SCOOTER_URL);
        driver.manage().window().maximize();
        objHomePageScooter = new HomePageScooterPOM(driver);
        objOrderPageScooter = new OrderPageScooterPOM(driver);
    }

    @Test
    public void testOrderPageScooterFirstSetUsingHeaderButtonChrome() {
        objHomePageScooter.waitForLoadHomePageHeaderButton();
        objHomePageScooter.clickHomePageHeaderButton();
        objOrderPageScooter.forWhomScooterForm(new Customer(
                "Иван",
                "Иванов",
                "Стромынка 45-1-58",
                "Сокольники",
                "89771234567"));
        objOrderPageScooter.aboutRentForm(new Order(
                "25.10.2022",
                5));
        objOrderPageScooter.popUpWindowOrderComplete();
    }

    @Test
    public void testOrderPageScooterSecondSetUsingHeaderButtonChrome() {
        objHomePageScooter.waitForLoadHomePageHeaderButton();
        objHomePageScooter.clickHomePageHeaderButton();
        objOrderPageScooter.forWhomScooterForm(new Customer(
                "Антон",
                "Рейников",
                "Алтайская 56-154",
                "Щёлковская",
                "89059876543"));
        objOrderPageScooter.aboutRentForm(new Order(
                "17.09.2022",
                3));
        objOrderPageScooter.popUpWindowOrderComplete();
    }

    @Test
    public void testOrderPageScooterFirstSetUsingMiddleButtonChrome() {
        objHomePageScooter.waitForLoadHomePageMiddleButton();
        objHomePageScooter.clickHomePageMiddleButton();
        objOrderPageScooter.forWhomScooterForm(new Customer(
                "Иван",
                "Иванов",
                "Стромынка 45-1-58",
                "Сокольники",
                "89771234567"));
        objOrderPageScooter.aboutRentForm(new Order(
                "25.10.2022",
                5));
        objOrderPageScooter.popUpWindowOrderComplete();
    }

    @Test
    public void testOrderPageScooterSecondSetUsingMiddleButtonChrome() {
        objHomePageScooter.waitForLoadHomePageMiddleButton();
        objHomePageScooter.clickHomePageMiddleButton();
        objOrderPageScooter.forWhomScooterForm(new Customer(
                "Антон",
                "Рейников",
                "Алтайская 56-154",
                "Щёлковская",
                "89059876543"));
        objOrderPageScooter.aboutRentForm(new Order(
                "17.09.2022",
                3));
        objOrderPageScooter.popUpWindowOrderComplete();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
