package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import mainPackage.ProjectMethods;
public class LoginPage extends ProjectMethods
{
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public LoginPage enterUsername()
	{
		driver.findElement(By.id("email")).sendKeys("harishrulez517@gmail.com");
		return new LoginPage();
	}
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("Test@984974");
		return new LoginPage();
	}
	public HomePage clickLogin()
	{
		driver.findElement(By.id("buttonLogin")).click();
		return new HomePage();
	}
}