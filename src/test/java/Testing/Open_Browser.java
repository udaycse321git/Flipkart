package Testing;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.sk.Tak;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Browser {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		String username = "admin";
		String password = "admin";

		Date date = new Date();
		String ddt = date.toString().replace(" ", "_").replace(":", "_");

		System.out.println("User is on login page");
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("projectpath"+projectPath);

		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Eclipse_Project\\MyCucumberProject\\MyCucumberProject\\src\\test\\resources\\drivers");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		System.setProperty("webdriver.chrome.args", "--version=118.0.5993.70");



		driver.get("https://www.ebay.com/");
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("window.scrollBy(0,500)");	
		
		

		Thread.sleep(3000);
		System.out.println("************************************************Build Success**********************************************************************************");
		driver.close();

	}
}
