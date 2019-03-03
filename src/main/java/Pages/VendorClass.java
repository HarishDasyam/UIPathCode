package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import mainPackage.ProjectMethods;
public class VendorClass extends ProjectMethods
{
	public VendorClass()
	{
		PageFactory.initElements(driver, this);
	}
	public VendorClass enterVendorIDDetails()
	{
		driver.findElement(By.id("vendorTaxID")).sendKeys("RO123456");
		return new VendorClass();
	}
	public VendorSearchResults clickSubmit()
	{
		driver.findElement(By.id("buttonSearch")).click();
		return new VendorSearchResults();
	}
}