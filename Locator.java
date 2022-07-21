package day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com");
        driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.id("email"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAtrribute('value','Green')", txtUserName);
		Object obj =  js.executeScript("return arguments[0].getAttribute('value')", txtUserName);
		String name =(String)obj;
		System.out.println(name);
		// txtUserName.sendKeys("6369683302");
		//WebElement txtPassword = driver.findElement(By.id("pass"));
		// txtPassword.sendKeys("A1.luraramu");
		
		///WebElement userLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		//userLogin.click();
		/* WebElement fbText = driver.findElement(By.xpath("//h2[contains(text(),'connect')]"));
		fbText.getText();
	    System.out.println(fbText);
	    WebElement createbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    createbtn.click();
	    Thread.sleep(3000);
	    WebElement genderBtn = driver.findElement(By.xpath("//label[text() = 'Male']"));
	    boolean sele = genderBtn.isSelected();
	    System.out.print(sele);
	    genderBtn.click();
	    TakesScreenshot screen1 =(TakesScreenshot)driver;
	    File src = screen1.getScreenshotAs(OutputType.FILE);
	    System.out.println(src);
	    File dest = new File("C:\\Users\\matar\\Downloads\\Arul\\lura.png");
	    FileUtils.copyFile(src, dest); */
	    
}
}
