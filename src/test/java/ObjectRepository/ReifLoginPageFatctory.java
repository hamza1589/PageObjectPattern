package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReifLoginPageFatctory {
    WebDriver driver;

    public ReifLoginPageFatctory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /* By username= By.xpath("//input[@id='login1']");
   By password= By.xpath("//input[@id='password']");
   By login= By.xpath("//input[@value='Sign in']");
   By home=By.xpath("//a[text()='rediff.com']");*/
    @FindBy(xpath = "//input[@id='login1']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//a[text()='rediff.com']")
    WebElement home;
    public WebElement emailId() {
        return username;


    }

    public WebElement passwordField() {
        return password;
    }

    public WebElement clickOnHome() {
        return home;
    }
}
