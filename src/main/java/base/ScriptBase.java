package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class ScriptBase {
    public WebDriver driver;

    @Parameters({"browser","environtment"})
    @BeforeClass

    public void BeforeTest(String browser,String environtment){

        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/gecodriver");
            driver = new FirefoxDriver();

        }

    if (environtment.equalsIgnoreCase("dev")){
        driver.get("http://automationpractice.com");

    }else if(environtment.equalsIgnoreCase("qa")){
        driver.get("http://automationpractice.com");

    }else if(environtment.equalsIgnoreCase("int"))
        driver.get("http://automationpractice.com");
        }
    @AfterClass
    public void closeBrowser(){
        driver.quit();

    }
}



