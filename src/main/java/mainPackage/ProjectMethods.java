package mainPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
public class ProjectMethods
{
	public static WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(38, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/vendors/results-by-id/RO123456");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(38, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}