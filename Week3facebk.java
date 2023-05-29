package week3.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Week3facebk {
public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("//a[text()='Forgotten password?']/following::a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//div[@class='_5dbb']/input[@name='firstname']")).sendKeys("Sharvesh");
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("YV");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sharveshyuva5@gmail.com");
		driver.findElement(By.xpath("//div[contains(@class,'uiStickyPlaceholderInput')]/input[@id='password_step_input']")).sendKeys("Selenium123");
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select bday = new Select(day);
		bday.selectByVisibleText("5");
		WebElement mon = driver.findElement(By.xpath("//select[@id='month']"));
		Select bmon = new Select(mon);
		bmon.selectByIndex(1);
		WebElement yr = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select byr = new Select(yr);
	    byr.selectByVisibleText("2000");
	    driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label[text()='Female']")).click();
	    driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(1000);
		
		/* Select class
		WebElement ind = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indus = new Select(ind);
        indus.selectByValue("IND_GEN_SERVICES");
        WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select owner = new Select(own);
        owner.selectByIndex(5);
        WebElement sta = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select stat = new Select(sta);
        stat.selectByVisibleText("Indiana");*/

		
		
		// driver.close();
		
		

	}

}
