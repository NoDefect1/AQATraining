import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestForm {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");

        // Закрываем cookie‑баннер, если он есть
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
    public void testForm() {
        WebElement form = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("pay-connection")
        ));

        form.findElement(By.id("connection-phone")).sendKeys("297777777");
        form.findElement(By.id("connection-sum")).sendKeys("10");
        form.findElement(By.id("connection-email")).sendKeys("test@example.com");

        WebElement submitButton = form.findElement(By.xpath(".//button[@type='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

        boolean nextStep = wait.until(ExpectedConditions.or(
                ExpectedConditions.urlContains("pay"),
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("form"))
        )) != null;

        Assert.assertTrue(nextStep);
        System.out.println("Test OK");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}


