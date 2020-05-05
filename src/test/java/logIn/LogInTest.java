package logIn;

import base.ScriptBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageController.LogInController;

public class LogInTest extends ScriptBase {

     LogInController login;
     @BeforeTest
     public void init(){
         BeforeTest();

     }


    @Test
    public void vrtifySignInButton(){
        login =new LogInController(driver);
        login.signInTab();

    }
}
