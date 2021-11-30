package selenium_project;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("http://www.leafground.com/pages/table.html");
driver.manage().window().maximize();
System.out.println("*******All Data*********");
	List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement webElement : alldata) { 
		                        // or
		                       //String text = webElement.getText();      
		                      // System.out.println(text);
		                                   
		System.out.println(webElement.getText()); 
	}
	//Thread.sleep(3000);
		//driver.close();
		System.out.println("....size......");
		int size = alldata.size();
		System.out.println("Size:" +size);
		System.out.println(".........Row Data.........");
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (WebElement row : rowdata) {
			System.out.println(row.getText());
			}
		System.out.println("***column data*****");
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for (WebElement column : columndata) {
			System.out.println(column.getText());
		}
		WebElement particular_element = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]"));
		System.out.println(particular_element.getText());
		}	
	}
