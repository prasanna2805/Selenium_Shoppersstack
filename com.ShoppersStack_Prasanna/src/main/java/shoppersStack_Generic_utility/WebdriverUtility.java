package shoppersStack_Generic_utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	public void capturewebpagescreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(Framework_Constants.Screenshotpath);
		org.openqa.selenium.io.FileHandler.copy(temp, dest);	
	}

	public void capturewebelementscreenshot(WebElement element) throws IOException {
		File temp= element.getScreenshotAs(OutputType.FILE);
		File dest = new File(Framework_Constants.Screenshotpath);
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}
	
	public void selectbyvalue (WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void jsexecutorclick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
}
