package pages;

import baseClass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {
    // Locators
    By locator = By.className("");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Instancia de la clase
    private static LoginPage instance = new LoginPage(driver);

    // Retorno Instancia
    public static LoginPage getInstance() {
        return instance;
    }
}
