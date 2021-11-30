package selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_site_signin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		WebElement mail = driver.findElement(By.id("email_create"));
	mail.sendKeys("vaishnavshind333@gmail.com");
	WebElement click_button = driver.findElement(By.id("SubmitCreate"));
	Thread.sleep(3000);
     click_button.click();
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement ms = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	ms.click();
	System.out.println(ms.isSelected());
	WebElement firstname = driver.findElement(By.id("customer_firstname"));
	firstname.sendKeys("Vaish");
	WebElement lastname = driver.findElement(By.id("customer_lastname"));
	lastname.sendKeys("navi");
	WebElement paswrd = driver.findElement(By.id("passwd"));
	paswrd.sendKeys("Vaishu*888");
	WebElement day = driver.findElement(By.id("days"));
	Select s=new Select(day);
	s.selectByValue("22");
	WebElement mnth = driver.findElement(By.id("months"));
	Select s1=new Select(mnth);
	s1.selectByValue("3");
	WebElement year = driver.findElement(By.id("years"));
	Select s2=new Select(year);
	s2.selectByValue("2014");
    WebElement checkbox1 = driver.findElement(By.id("newsletter"));
	checkbox1.click();
	WebElement checkbox2 = driver.findElement(By.id("optin"));
	checkbox2.click();
	WebElement company = driver.findElement(By.id("company"));
	company.sendKeys("xyz company");
	WebElement address1  = driver.findElement(By.id("address1"));
	address1.sendKeys("2, street");
	WebElement address2 = driver.findElement(By.id("address2"));
	address2.sendKeys("nagar,city");
	WebElement city = driver.findElement(By.id("city"));
	city.sendKeys("Trenton");
	WebElement state = driver.findElement(By.id("id_state"));
	Select s3=new Select(state);
	s3.selectByVisibleText("New Jersey");
	WebElement zipcode = driver.findElement(By.id("postcode"));
	zipcode.sendKeys("08605");
	WebElement country = driver.findElement(By.id("id_country"));
	Select s4=new Select(country);
	s4.selectByVisibleText("United States");
	WebElement addinfo = driver.findElement(By.id("other"));
	addinfo.sendKeys("order dress");
	WebElement mobilephne = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
	mobilephne.sendKeys("8945678900");
	WebElement futureref = driver.findElement(By.id("alias"));
	futureref.clear();
	futureref.sendKeys("same address");
    WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
	register.click();
}
}
