package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_003 {
	
		@Test
		public void setup3() {
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			 

			WebDriver driver=new ChromeDriver();
			 

			driver.get("https://ocs.ca/");
			 
			// Maximize browser
			 
			driver.manage().window().maximize();
			Select dropdown_day = new Select(driver.findElement(By.id("dob__day")));
			dropdown_day.selectByIndex(1);
			Select dropdown_month = new Select(driver.findElement(By.id("dob__month")));
			dropdown_month.selectByIndex(3);
			Select dropdown_year = new Select(driver.findElement(By.id("dob__year")));
			dropdown_year.selectByValue("1950");
			driver.findElement(By.cssSelector("button.btn.btn--outline")).click();;
			driver.findElement(By.cssSelector("span.checkbox")).click();
			driver.findElement(By.cssSelector("button.btn.btn--outline")).click();; 
			driver.quit();

			 
			}

}
