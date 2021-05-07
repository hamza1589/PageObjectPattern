package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReifLoginPage {
    WebDriver driver;
    public ReifLoginPage(WebDriver driver){
        this.driver=driver;
    }
   By username= By.xpath("//input[@id='login1']");
  By password= By.xpath("//input[@id='password']");
  By login= By.xpath("//input[@value='Sign in']");
  By home=By.xpath("//a[text()='rediff.com']");
  public WebElement emailId(){
      return driver.findElement(username);

  }
  public WebElement passwordField(){
      return driver.findElement(password);
  }
  public WebElement clickOnSignIn(){
      return driver.findElement(login);
  }
  public WebElement clickOnHome(){
      return driver.findElement(home);
  }
}
