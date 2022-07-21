import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.sprint_4.POM.OrderPageScooterPOM;

public class TestYandexScooterOrderChrome {

    private WebDriver driver;

    @Test
    public void testOrderPageScooterFirstSetUsingHeaderButtonChrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        OrderPageScooterPOM objOrderPageScooter = new OrderPageScooterPOM(driver);
        objOrderPageScooter.orderUsingHeaderButton(
                driver,
                "Иван",
                "Иванов",
                "Стромынка 45-1-58",
                "Сокольники",
                "89771234567",
                "25.10.2022",
                5);
    }

    @Test
    public void testOrderPageScooterSecondSetUsingHeaderButtonChrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        OrderPageScooterPOM objOrderPageScooter = new OrderPageScooterPOM(driver);
        objOrderPageScooter.orderUsingHeaderButton(
                driver,
                "Антон",
                "Рейников",
                "Алтайская 56-154",
                "Щёлковская",
                "89059876543",
                "17.09.2022",
                3);
    }

    @Test
    public void testOrderPageScooterFirstSetUsingMiddleButtonChrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        OrderPageScooterPOM objOrderPageScooter = new OrderPageScooterPOM(driver);
        objOrderPageScooter.orderUsingMiddleButton(
                driver,
                "Иван",
                "Иванов",
                "Стромынка 45-1-58",
                "Сокольники",
                "89771234567",
                "25.10.2022",
                5);
    }

    @Test
    public void testOrderPageScooterSecondSetUsingMiddleButtonChrome() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        OrderPageScooterPOM objOrderPageScooter = new OrderPageScooterPOM(driver);
        objOrderPageScooter.orderUsingMiddleButton(
                driver,
                "Антон",
                "Рейников",
                "Алтайская 56-154",
                "Щёлковская",
                "89059876543",
                "17.09.2022",
                3);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
