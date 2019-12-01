package pages;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class landingPage extends Base {
    By loginLocator=By.xpath("//span[text()='Login']");
    By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
    By nawBar=By.cssSelector("ul.nav.navbar-nav.navbar-right");

    public WebElement getLandingPage(){

        return driver.findElement(loginLocator);
    }

    public WebElement getnawBar() throws InterruptedException {
        return driver.findElement(nawBar);
    }
    public WebElement getTitle(){

        return driver.findElement(title);
    }
}
