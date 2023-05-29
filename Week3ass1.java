package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week3ass1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Elder to Younger Sibling
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("Demosalesmanager");
		//Elder Cousin to Younger Cousin
		driver.findElement(By.xpath("//input[@class='inputLogin']/following::input[@id='password']")).sendKeys("crmsfa");
		//Gp to Gc
		
		driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();
		
		// Young Cousin to Elder Cousin
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']/preceding::a[contains(text(),'CRM')]")).click();
		//GP to GC
		driver.findElement(By.xpath("//div[@class='x-panel-tc']//a[text()='Leads']")).click();
		//EC to YC
		driver.findElement(By.xpath("//a[text()='My Leads']/following::a[contains(text(),'Create Lead')]")).click();
		//Collect Method EC to YC
		driver.findElement(By.xpath("(//span[@class='requiredField']/following::input)[1]")).sendKeys("TCS");
		driver.findElement(By.xpath("//span[text()='First name']/following::input[@id='createLeadForm_firstName']")).sendKeys("Sharvesh");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/following::input")).sendKeys("Yuvaraj");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        driver.findElement(By.xpath("//a[text()='Qualify Lead']/following::a[text()='Edit']")).click();
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).sendKeys("Infosys");
        driver.findElement(By.xpath("(//td[@colspan='4']/input[@class='smallSubmit'])[1]")).click();
        
        

		
		driver.close();

	}

}
