package uipathPacage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class uipath
{
	public static void main(String hd[])
	{	System.out.println("Lord Balaji");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/vendors/results-by-id/RO123456");
		driver.findElement(By.id("email")).sendKeys("harishrulez517@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@984974");
		driver.findElement(By.id("buttonLogin")).click();
		WebDriverWait wait = new WebDriverWait(driver,21);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown'][5]"))).click();;
		driver.findElement(By.linkText("Search for Vendor")).click();
		driver.findElement(By.id("vendorTaxID")).sendKeys("RO123456");
		driver.findElement(By.id("buttonSearch")).click();
		WebElement table = driver.findElement(By.className("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		//List<WebElement> columns = table.findElements(By.tagName("td"));
		List<WebElement> columns = rows.get(1).findElements(By.tagName("td"));
		System.out.println(columns.get(0).getText());
	}
}