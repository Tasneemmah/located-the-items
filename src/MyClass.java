import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\my new drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5504/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("My-Select")).click();
		
		driver.findElement(By.id("My-Select")).sendKeys("C"+ Keys.ENTER);
	}
}