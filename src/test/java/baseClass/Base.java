package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Base {
    public static WebDriver driver;

    public Base(WebDriver driver) {
        Base.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "webdrivers//chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public void visit(String url) {
        driver.get(url);
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void fluentWait(By locator) {
        Wait<WebDriver> fluWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(250)).ignoring(NoSuchElementException.class);
        fluWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
