import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class MainDrom {
    WebDriver driver;
    Actions actions;
    WebDriverWait webDriverWait;

    public MainDrom(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@class='css-1hrj9kg e1xxt55l0']")
    public WebElement auto;
    @Step("Клик по кнопке Подать объявление")
    public void clickAuto() {
        auto.click();
    }
}