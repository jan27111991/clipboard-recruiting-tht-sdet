
package testCases;
import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import amazon.objectrepositories.AmazonOR;

import com.typesafe.config.Config;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;



public class TestSandbox {
    private static Config config = EnvFactory.getInstance().getConfig();
    private static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    private WebDriver driver = DriverFactory.getDriver();

	@Test
    void assertThatHomePageTitleIsCorrect() {
    	driver.get(HOME_PAGE_URL);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", driver.getTitle());
    	driver.manage().window().maximize();
	    AmazonOR amazonOR = new AmazonOR(driver);
	    amazonOR.HamburgerMenuDesktop.click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    amazonOR.shopByCategory.click();
	    amazonOR.sideMenu.click();
	    amazonOR.television.click();
        js.executeScript("arguments[0].scrollIntoView();", amazonOR.brands);
        amazonOR.samsung.click();
        amazonOR.dropDown.click();
        amazonOR.hightoLowdropDownValue.click();
        amazonOR.secondHighest.click();
        String orgWin = driver.getWindowHandle();
        Set<String> win = driver.getWindowHandles();
        for (String w:win) {
        	if (!w.equals(orgWin)) {
        		driver.switchTo().window(w);
        		break;
        	}
        }
        js.executeScript("arguments[0].scrollIntoView();", amazonOR.aboutItem);
        System.out.println("Item Description => "+amazonOR.itemDescription.getText());
        driver.quit();
    }
	
	
}
