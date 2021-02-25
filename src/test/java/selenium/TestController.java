package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestController {
	
	private WebDriver wc;

	
	public void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		
		wc=new ChromeDriver();
		wc.get("https://www.softwaretestingo.com/selenium-tutorial/");
		
		
		
	}
	
	public static void main(String[] args) {
		TestController tc=new TestController();
		tc.initialize();
	}
}
