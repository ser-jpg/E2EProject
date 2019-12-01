package pages;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends Base {
    By emailLocator=By.cssSelector("#user_email");
    By passwordLocator=By.cssSelector("#user_password");
    By logInLocator=By.xpath("//input[@type='submit']");



    public  WebElement enterEmailAddress(){
       return driver.findElement(emailLocator);

    }
    public WebElement enterPassword(){
       return driver.findElement(passwordLocator);

    }
    public WebElement clickLoginIn(){

      return   driver.findElement(logInLocator);

    }

}
