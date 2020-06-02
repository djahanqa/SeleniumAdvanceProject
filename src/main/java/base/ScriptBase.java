package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScriptBase {
    public WebDriver driver;

    @Parameters({"browser","environtment"})
    @BeforeClass
    public void BeforeTest(String browser,String environtment){

        if(browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
            driver=new ChromeDriver();
        }

    if (environtment.equalsIgnoreCase("dev")){
        driver.get("http://automationpractice.com");

    }else if(environtment.equalsIgnoreCase("QA")){
        driver.get("http://automationpractice.com");

    }else if(environtment.equalsIgnoreCase("int"))
        driver.get("http://automationpractice.com");
        }
    @AfterClass
    public void closeBrowser(){
        driver.quit();

    }
}



