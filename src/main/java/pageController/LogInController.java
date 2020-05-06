package pageController;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInController {

    @FindBy(xpath ="//*[@id='header']//a[contains(text(),'Sign in')]")
    WebElement signInButton;
    @FindBy(id="email")
    WebElement userName;
    @FindBy(id="passwd")
    WebElement userPW;
    @FindBy(css = "#SubmitLogin > span")
    WebElement submitLogIn;
    @FindBy(xpath= "//p[contains(text(),'There is 1 error')]")
    WebElement error;


    public LogInController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

        public void signInTab(){
        signInButton.isDisplayed();



    }
public void invalidLogIn() throws InterruptedException {
    Thread.sleep(1000);

    signInButton.click();
        userName.sendKeys("abcde@gmail.com");
        userPW.sendKeys("abcd1234");
        submitLogIn.click();
    Assert.assertEquals(error,error);

}
}
