package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Session9thDecAssignment3 {
	
		WebDriver driver;
			
	@Test
	  public void f() {
		Select make=new Select(driver.findElement(By.name("make")));
		make.selectByVisibleText("Mercedes");
		
		WebElement diesel=driver.findElement(By.xpath("//input[@value='Diesel']"));
		if(!diesel.isSelected()) {
		diesel.click();
		}
		
		WebElement feature=driver.findElement(By.name("airbags"));
		if(!feature.isSelected()) {
			feature.click();
			}
				
		
		Select color= new Select(driver.findElement(By.name("color")));
		color.selectByVisibleText("Red");
		
		driver.findElement(By.xpath("//input[@name='Conf_Next']")).click();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://cookbook.seleniumacademy.com/Config.html");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }


}
