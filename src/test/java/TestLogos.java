import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class TestLogos {
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
    public void testLogos() {
        By logosLocator = By.xpath("//div[@class='pay__partners']//img");
        List<WebElement> logos = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(logosLocator));
        Assert.assertFalse(logos.isEmpty());

        List<String> alts = logos.stream().map(el -> el.getAttribute("alt")).toList();
        Assert.assertTrue(alts.contains("Visa"));
        Assert.assertTrue(alts.contains("Verified By Visa"));
        Assert.assertTrue(alts.contains("MasterCard"));
        Assert.assertTrue(alts.contains("MasterCard Secure Code"));
        Assert.assertTrue(alts.contains("Белкарт"));

        System.out.println("Test OK" + alts);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
