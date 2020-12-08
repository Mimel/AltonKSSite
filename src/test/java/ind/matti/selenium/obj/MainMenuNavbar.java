package ind.matti.selenium.obj;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuNavbar {
	public WebDriver driver;
	
	@FindBy(className = "dropdown-toggle")
	public List<WebElement> navbar;
	
	public MainMenuNavbar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void goToNavbarLink(int num) {
		navbar.get(num).click();
	}
}
