package testCases;
import org.testng.annotations.Test;
import Pages.LoginPage;
import mainPackage.ProjectMethods;
public class TC001_UIPath extends ProjectMethods
{
	@Test
	public void findVendorName()
	{System.out.println("Lord Balaji");
		new LoginPage().enterUsername().enterPassword().clickLogin().waitForSometimeAndClick().
		vendorSearch().enterVendorIDDetails().clickSubmit().
		enterVendorDetails();
	}
}