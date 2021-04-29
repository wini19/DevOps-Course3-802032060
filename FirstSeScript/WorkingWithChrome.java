package FirstSeScript;

import org.openqa.selenium.chrome.ChromeDriver;

//first selinium code

public class WorkingWithChrome {
	
	ChromeDriver driver;
	
	String url = "https://archimedes-lms.thapar.edu/moodle/login/?_ga=2.53582568.1535561812.1619082121-1222420403.1618765799";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\eclipse-workspace\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	public void closeBrowser() {
		
		// driver.close(); //close only the current active window
		driver.quit(); //to close all windows
	}

	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		wc.invokeBrowser();
		wc.closeBrowser();
		
	}
}
