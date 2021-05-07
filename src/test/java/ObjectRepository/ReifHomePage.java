package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReifHomePage {
    WebDriver driver;

    public ReifHomePage(WebDriver driver) {
        this.driver = driver;
    }
    By searchBar=By.id("srchword");
    By searchBarButton=By.xpath("//input[@class='newsrchbtn']");
    public WebElement searchBarField(){
        return driver.findElement(searchBar);
    }
    public WebElement clickOnSearch(){
        return driver.findElement(searchBarButton);
    }


}
