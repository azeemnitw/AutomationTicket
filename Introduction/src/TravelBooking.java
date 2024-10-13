import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class TravelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.dummyticket.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.findElement(By.xpath("//a[text()='Buy Ticket']")).click();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.findElement(By.xpath("//input[@id='travname']")).sendKeys("rohit");
		dr.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("kumar");
		
		dr.findElement(By.id("dob")).click();
		
		WebElement ddown=dr.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sel=new Select(ddown);
		sel.selectByValue("5");
		WebElement ddown1=dr.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sel1=new Select(ddown1);
		sel1.selectByValue("1995");
		dr.findElement(By.xpath("//a[@data-date='15']")).click();
		
		//dr.close();		
		
		
	}

}
