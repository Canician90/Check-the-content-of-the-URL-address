package dfads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Hgb {
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_WebDriver");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Create account")).click();
		String url1=driver.getCurrentUrl();
		//System.out.println(url1);

		if (url1.contains("wikipedia.org")){
			System.out.println("1st Verification: "+ "It is an Internal Link – Passed");
			}
	 	else {
		System.out.println("1st Verification: "+ "It is Not an Internal Link – Failed");
		}
	 	
	 	
		driver.navigate().back();
		Thread.sleep(4000);
		

		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		String url2 = new String();
		//System.out.println(url2);

		if (url2.contains("selenium.dev")) {
			System.out.println("2nd Verification: "+ "It is an External Link – Passed");
			}
			else
			{
			System.out.println("2nd Verification: "+ "It is Not an External Link – Failed");
			}
			driver.close();
			}
			
}


