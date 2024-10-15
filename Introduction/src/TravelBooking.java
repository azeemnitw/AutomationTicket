import java.sql.Time;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
		List<WebElement> l=dr.findElements(By.name("sex"));
		//dr.close();	
		for(WebElement e:l) {
			if(e.getAttribute("value").equalsIgnoreCase("1")) {
				e.click();
			}
		}
		List<WebElement>r=dr.findElements(By.name("traveltype"));
		for(WebElement e:r) {
			if(e.getAttribute("value").equalsIgnoreCase("2")) {
				e.click();
			}
		}
		dr.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Delhi");
		dr.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Bengaluru");
		
		//here I am selecting departure date
		dr.findElement(By.id("departon")).click();
		
		WebElement ddown2=dr.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sel2=new Select(ddown2);
		sel2.selectByValue("2025");
		
		WebElement ddown3=dr.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sel3=new Select(ddown3);
		sel3.selectByValue("0");
		dr.findElement(By.xpath("//a[@data-date='8']")).click();
		//selection ended here
		
		//here i am selecting return date
        dr.findElement(By.id("returndate")).click();
		
		WebElement ddown4=dr.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sel4=new Select(ddown4);
		sel4.selectByValue("2025");
		
		WebElement ddown5=dr.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sel5=new Select(ddown5);
		sel5.selectByValue("0");
		dr.findElement(By.xpath("//a[@data-date='13']")).click();
		//return date selected
		
		//selecting message on both email and whatsapp
		List<WebElement>ele=dr.findElements(By.name("deliverymethod"));
		for(WebElement e:ele) {
			if(e.getAttribute("value").equalsIgnoreCase("3")) e.click();
		}
		
		dr.findElement(By.id("billing_email")).sendKeys("prashant@gmail.com");
		dr.findElement(By.id("billing_phone")).sendKeys("9966885577");
		dr.findElement(By.id("billing_address_1")).sendKeys("100 new area");
		dr.findElement(By.id("billing_address_2")).sendKeys("anand vihar");
		dr.findElement(By.id("billing_city")).sendKeys("Delhi");
		
		//selecting state of customer
		dr.findElement(By.id("select2-billing_state-container")).click();
		dr.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Delhi");
		dr.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.ARROW_DOWN);
		dr.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("billing_postcode")).sendKeys("110092");
		dr.findElement(By.id("place_order")).click();
		
		
	}

}
