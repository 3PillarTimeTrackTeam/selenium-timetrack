package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {

    public static WebDriver driver;
    static LoginPage loginPage;

    @BeforeClass
    public static void setUp() {
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConnection();
        loginPage.visit("url");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Steps
    LoginSteps loginSteps;

    @Test
    public void testOne() {
        //loginSteps.metodoClaseLoginSteps();
    }
}
