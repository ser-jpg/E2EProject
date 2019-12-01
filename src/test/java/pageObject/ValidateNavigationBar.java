package pageObject;

import common.Base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.landingPage;

import java.io.IOException;

import static common.Base.getDriver;
import static common.Base.getProperty;

public class ValidateNavigationBar extends Base {

    @Test
    public void basePageNavigation() throws IOException, InterruptedException {
        //driver=getDriver();
        //driver.get(getProperty("url"));
        landingPage lanPage = new landingPage();
        Assert.assertTrue(lanPage.getnawBar().isDisplayed());
    }

    @AfterTest
    public void getCloseDriver() {
        closeDriver();
        driver = null;
    }
}
