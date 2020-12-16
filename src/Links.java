import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		/*System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println(driver.findElement(By.id("gf-BIG")));*/
		
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("ind");
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("prasad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).sendKeys("raju");
		driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"show-textbox\"]")).click();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]")).click();
		
		
		
		
		
		
		
		
	}
	

}
