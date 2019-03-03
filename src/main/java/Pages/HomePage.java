package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import mainPackage.ProjectMethods;
public class HomePage extends ProjectMethods
{
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public HomePage waitForSometimeAndClick()
	{	WebDriverWait wait = new WebDriverWait(driver,21);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown'][5]"))).click();;
		return new HomePage();
	}
	public VendorClass vendorSearch()
	{
		driver.findElement(By.linkText("Search for Vendor")).click();
		return new VendorClass();
	}
}