package shoppersStack_Generic_utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack_POM.Home_Page;
import com.ShoppersStack_POM.User_credentials;
import com.ShoppersStack_POM.loginpage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {

	public WebDriver driver;
	public static WebDriver sdriver;
	public Fileutility utility = new Fileutility();
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public User_credentials welcomepage;
	public loginpage login;
	public Home_Page homepage;
	public WebDriverWait wait;
	public WebdriverUtility webdriverutility = new WebdriverUtility();

	@BeforeSuite()
	public void beforesuite() {
		System.out.println("@Before suite_________Database connected");
	}

	@BeforeTest()
	public void beforeTest() {
		System.out.println("@Before Test___________Extent reports Started");
		spark = new ExtentSparkReporter(Framework_Constants.reportpath);
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test = reports.createTest("Demo");
	}

	@BeforeClass
	public void beforeclass() throws Exception {
		System.out.println("@before class_______________browser launched");

		String browser = utility.loaddatafromPropertyfile("browsername");
		String url = utility.loaddatafromPropertyfile("url");
		
		//to run via Parameters in CMD we need to give below system.get property
//		String browser = System.getProperty("browsername");
//		String url=System.getProperty("url");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		sdriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get(url);
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {
		System.out.println("@Before method_________Login");
		welcomepage = new User_credentials(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(welcomepage.getLoginuser()));
		welcomepage.getLoginuser().click();
		Thread.sleep(3000);
		login = new loginpage(driver);
		login.getEnteremailid().sendKeys(utility.loaddatafromPropertyfile("username"));
		login.getEnterpassword().sendKeys(utility.loaddatafromPropertyfile("password"));
		login.getLoginbtn().click();
		homepage = new Home_Page(driver);
	}

	@AfterClass
	public void afterclass() {
		System.out.println("@Afterclass__________________browser closed");
		driver.quit();
	}

	@AfterTest
	public void aftertest() {
		System.out.println("aftertest______________________extent reports finished");
		reports.flush();
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("@After suite_________________Database disconnected");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		System.out.println("@Aftermethod___________logout");
		Thread.sleep(2000);
		homepage.getProfilebtn().click();
		Thread.sleep(2000);
		homepage.getLogoutbtn().click();
	}

}
