import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.dummyticket.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.findElement(By.xpath("//a[text()='Buy Ticket']")).click();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.findElement(By.xpath("//input[@id='travname']")).sendKeys("rohit");
		dr.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("kumar");
		
		dr.findElement(By.id("dob")).click();
		
		while(!dr.findElement(By.xpath("//select[@class='ui-datepicker-month']")).getText().contains("Jan")) {
		    dr.findElement(By.cssSelector("//a[@data-handler='prev']")).click();
		}

	}

}
