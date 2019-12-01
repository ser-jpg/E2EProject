package pageObject;

import common.Base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.landingPage;

import java.io.IOException;

public class ValidateTitle extends Base {

   @Test
    public void basePageNavigation() throws IOException {
       // driver=getDriver();
       //driver.get(getProperty("url"));
        landingPage lanPage=new landingPage();
       String actual=lanPage.getTitle().getText();
       String expected="FEATURED COURSES";
       Assert.assertEquals(expected,actual);
    }
    @AfterTest
    public void getCloseDriver(){
        closeDriver();
        driver=null;
    }
}
