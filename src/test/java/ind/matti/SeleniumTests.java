package ind.matti;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ind.matti.selenium.obj.MainMenuNavbar;

class SeleniumTests {
	private static WebDriver driver;
	private MainMenuNavbar mmn;
	
	@BeforeAll
	public static void setUp() {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumeasy.com/test/");
	}
	
	// TODO: Play more!
	@Test
	public void trialSearch() {
		System.out.println("Test!");
		mmn = new MainMenuNavbar(driver);
		mmn.goToNavbarLink(0);
	}

}
