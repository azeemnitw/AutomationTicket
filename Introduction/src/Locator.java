import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://rahulshettyacademy.com/");
		dr.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
		
		dr.findElement(By.id("email")).sendKeys("Rahul");
		dr.findElement(By.id("password")).sendKeys("1234");
		dr.findElement(By.name("commit")).click();
		dr.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		//dr.close();
		

	}

}
