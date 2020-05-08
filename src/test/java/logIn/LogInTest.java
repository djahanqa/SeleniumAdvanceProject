package logIn;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageController.LogInController;

public class LogInTest extends ScriptBase {

    LogInController login;

    @BeforeTest
    public void init() {
        BeforeTest();

    }

    @Test(priority = 1)

    public void vrtifySignInButton() {
        login = new LogInController(driver);
        login.signInTab();
    }

    @Test(priority = 2)
    public void vrtifyinvalidLogIn( ) throws InterruptedException {
        login = new LogInController(driver);
        login.invalidLogIn(driver, "There is 1 error");
    }


}