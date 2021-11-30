package selenium_project;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class Automation_site_login {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	Thread.sleep(3000);
	WebElement login_mail = driver.findElement(By.id("email"));
	login_mail.sendKeys("vaishnavshind333@gmail.com");
	WebElement login_pw = driver.findElement(By.id("passwd"));
	login_pw.sendKeys("Vaishu*888");
	
	WebElement click_login = driver.findElement(By.id("SubmitLogin"));
	click_login.click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//WebElement category = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/div"));
	//category.click();		
	WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	Actions a=new Actions(driver);
	a.moveToElement(women).build().perform();
	WebElement t_shirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
	t_shirts.click();
	WebElement add = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
	a.moveToElement(add).build().perform();
	WebElement adding_cart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
	adding_cart.click();
	WebElement proceed_checkout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	proceed_checkout.click();
	WebElement proceed = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	proceed.click();
	WebElement proceed1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
	proceed1.click();
	WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
	checkbox.click();
	WebElement proceed2 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
	proceed2.click();
	WebElement check = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
	check.click();
	WebElement order = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
	order.click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500);");
	TakesScreenshot ts=  (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination =new File("C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\screenshots\\snap1.png");
	FileHandler.copy(source, destination);
}
}
