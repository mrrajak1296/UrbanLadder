package urbantest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class urban {
	WebDriver driver;
	
	
	@BeforeClass(alwaysRun  = true)
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority=1,groups = "smoke")
	public void homepage() {
	String	ans = driver.findElement(By.cssSelector("[class=\"header__topBar_logo\"]")).getText();
		
	System.out.println(ans);
		
	}
	
	@Test(priority=2,groups = "smoke")
	public void Search() throws InterruptedException {
		driver.findElement(By.id("search")).sendKeys("Sofa");
		driver.findElement(By.id("search_button")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("[class=\"close-reveal-modal hide-mobile\"]")).click();
		
	}
	
	@Test(priority=3,groups = "sanity")
	public void naviagteProduct() {
		
		driver.findElement(By.xpath("(//div[@class=\"productbox\"])[1]")).click();
		
	}
	
	@Test(priority=4,groups = "sanity")
	public void productname() {
		
		String sofa = driver.findElement(By.cssSelector("[class=\"page-heading product-title no-margin\"]")).getText();
		
		System.out.println(sofa);
	}
	
	@Test(priority=5,groups = "sanity")
	public void price() {
		
		String Price = driver.findElement(By.cssSelector("[class=\"price final\"]")).getText();
		System.out.println(Price);
	}
	
	@Test(priority=6,groups = "smoke")
	public void addingproduct() {
		
		driver.findElement(By.id("add-to-cart-button")).click();
		WebElement cart = driver.findElement(By.id("select_0_quantity"));
	    assert cart.isDisplayed();
		
		driver.findElement(By.cssSelector("[class=\"wishtext_login\"]")).click();
		
	}
	
	
	
	@AfterClass(alwaysRun  = true)
	public void teardown() {
		driver.quit();
	}


}
