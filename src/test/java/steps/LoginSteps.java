package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginSteps {
    // Objeto Login para obtener instancia
    LoginPage instance = LoginPage.getInstance();

    @Step("Step 01")
    public void stepOne() {
        //instance.metodoClaseLoginPage()
    }
}
