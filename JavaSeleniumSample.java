package day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaSeleniumSample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		//To get the URL
		String url= driver.getCurrentUrl();
		System.out.println(url);
		//To get the Title
		String title = driver.getTitle();
	    System.out.println(title);
		

	}

}
