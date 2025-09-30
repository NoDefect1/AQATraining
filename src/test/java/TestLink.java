import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.time.Duration;

public class TestLink {
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
        } catch (TimeoutException e){};
    }

    @Test
    public void testLink() {
        WebElement moreInfoLink = driver.findElement(By.xpath("//a[contains(text(),'Подробнее о сервисе')]"));
        moreInfoLink.click();

        wait.until(ExpectedConditions.urlToBe(
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"
        ));
        System.out.println("Test OK");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}


