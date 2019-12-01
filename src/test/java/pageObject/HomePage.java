package pageObject;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import common.Base;
import pages.LoginPage;
import pages.landingPage;

import java.io.IOException;

public class HomePage extends Base {

@BeforeTest
   public void invokeDriver() throws IOException {
    driver=getDriver();
    driver.get(getProperty("url"));

   }
    @Test(dataProvider = "getData")
    public void navigateHomePage(String email,String password) throws IOException {


        landingPage lanPage=new landingPage();
        LoginPage logPage=new LoginPage();
        lanPage.getLandingPage().click();
        logPage.enterEmailAddress().sendKeys(email);
        logPage.enterPassword().sendKeys(password);
        logPage.clickLoginIn().click();
        System.out.println(email);
        System.out.println(password);


    }

    @DataProvider
    public Object[][] getData(){
        Object [][]data=new Object[1][2];
        data[0][0]="userkansen@gmail.com";
        data[0][1]="12345";
        return data;


    }
    @AfterTest
    public void getCloseDriver(){
        closeDriver();
        driver=null;
    }




}
