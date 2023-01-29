import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.final_projeck_4_sprint.model.MainPage;

import static org.junit.Assert.assertEquals;


public class CheckDropDownList {
    private WebDriver driver;
    @Before
    public void setup() {
        driver = new ChromeDriver();
    }
    @Test
    public void checkElementForClick() {
        MainPage page = new MainPage(driver);
        page.open();
        page.clickCoockieButton();
        page.clickDropDownList1();
        page.getTextFirstElementDrop();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой";
        String actual = page.getTextFirstElementDrop();
        assertEquals(expected, actual, "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        //удалть все куки
        driver.quit();
        // Закрой браузер
    }
}
