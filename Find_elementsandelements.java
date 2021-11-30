package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elementsandelements {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
//driver.get("https://www.instagram.com/");

Thread.sleep(3000);

//WebElement we = driver.findElement(By.name("email"));
//we.sendKeys("we");

//WebElement wee = driver.findElement(By.id(""));
//wee.sendKeys("");

WebElement f = driver.findElement(By.xpath("//input[@type='text']"));
f.sendKeys("vaishnavi4550@gmail.com");


WebElement elm = driver.findElement(By.name("pass"));elm.sendKeys("Vaishu@4550");

WebElement em = driver.findElement(By.name("login"));em.click();

   // WebElement we= driver.findElement(By.xpath("(//label[@class='f0n8F'])[1]"));
//we.sendKeys("hjdfhdjfh");
     


// insta WebElement el = driver.findElement(By.name("username"));      //username
// insta  el.sendKeys("vaishnavi4550@gmail.com");
  

// insta  WebElement pw = driver.findElement(By.name("password"));     //pw
// insta  pw.sendKeys("Vaishu@4550");

// insta   driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();  //login button
   //or
// insta  driver.findelement(By.xpath("//div[text()='Log In']").click();



//  insta    WebElement fe = driver.findElement(By.xpath("//input[@type='text']"));  //username for insta by using xpath
//fe.sendKeys("hello");
// System.out.println(fe.getAttribute("value"));    //.....to print the value we are passing in the username...

//driver.findElement(By.name("login")).click();


//driver.findElement(By.XPath)



//System.out.println(f);
//f.sendKeys("");


	





	}

}
