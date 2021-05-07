package TestCase;

import ObjectRepository.ReifHomePage;
import ObjectRepository.ReifLoginPage;
import ObjectRepository.ReifLoginPageFatctory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginApplication {
    @Test
    public void Login(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamza\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        ReifLoginPage rd=new ReifLoginPage(driver);
//        rd.emailId().sendKeys("David");
//        rd.passwordField().sendKeys("selfie");
//        rd.clickOnSignIn().click();
//        rd.clickOnHome().click();
//        ReifHomePage hp= new ReifHomePage(driver);
//        hp.searchBarField().sendKeys("Iphone");
//        hp.clickOnSearch().click();
        ReifLoginPageFatctory pf=new ReifLoginPageFatctory(driver);
        pf.emailId().sendKeys("David");
        pf.passwordField().sendKeys("UbUNTU");
        pf.clickOnHome().click();



    }
}
