import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestBlock {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");
        try {
            WebElement cookieButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[contains(.,'Отклонить') or contains(.,'Принять')]")
                    )
            );
            cookieButton.click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.cookie.show")));
        } catch (TimeoutException e){
            System.out.println();
        }
    }

    @Test
    public void testBlock() {
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[contains(.,'Онлайн пополнение')]")
        ));
        String actual = title.getText().replaceAll("\\s+", " ").trim();
        Assert.assertEquals(actual, "Онлайн пополнение без комиссии");
        System.out.println("Test OK");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}

