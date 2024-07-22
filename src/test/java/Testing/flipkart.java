package Testing;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String username = "admin";
		String password = "admin";

		Date date = new Date();
		String ddt = date.toString().replace(" ", "_").replace(":", "_");

		System.out.println("User is on login page");


		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		System.setProperty("webdriver.chrome.args", "--version=118.0.5993.70");



		driver.get("https://www.flipkart.com/");
		WebElement search_tab = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search_tab.sendKeys("mobiles");
		search_tab.sendKeys(Keys.ENTER);

		List<WebElement> phone_list = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));


		int length = phone_list.size();
		System.out.println(length);
		if(length !=0)
		{
			for(WebElement adding_list : phone_list )
			{
				//String pp = adding_list.getText();
				//System.out.println(pp);
				//Motorola G34 5G (Ice Blue, 128 GB)
				boolean status =  adding_list.getText().contains("Motorola G34 5G (Ice Blue, 128 GB)");
				System.out.println(status);
				if(status == true)
				{
					adding_list.click();
					break;
				}
				else
					System.out.println("no data found");
			}
		}
		else
			System.out.println("No phone list found");


		Thread.sleep(3000);
		System.out.println("************************************************Build Success**********************************************************************************");
		driver.close();

	}

}
