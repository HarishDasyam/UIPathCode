package Pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import mainPackage.ProjectMethods;
public class VendorSearchResults extends ProjectMethods
{
	public VendorSearchResults()
	{
		PageFactory.initElements(driver, this);
	}
	public VendorSearchResults enterVendorDetails()
	{
		WebElement table = driver.findElement(By.className("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> columns = rows.get(1).findElements(By.tagName("td"));
		System.out.println(columns.get(0).getText());
		return new VendorSearchResults();
	}
}