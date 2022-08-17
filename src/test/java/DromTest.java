import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DromTest {
    WebDriver driver;

    @Before
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.drom.ru/");
    }

    @Test

    @DisplayName("Переход")
    public void test() {
        MainDrom mainDrom = new MainDrom(driver);
        mainDrom.clickAuto();
    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}




