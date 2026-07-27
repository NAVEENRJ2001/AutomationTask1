package com;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		// Create a map to store profile preferences
		Map<String, Object> prefs = new HashMap<>();

		// 1. Disable the data breach password leak detection alert
		prefs.put("profile.password_manager_leak_detection", false);

		// 2. Disable Chrome from offering to save passwords
		prefs.put("credentials_enable_service", false);

		// 3. Disable the password manager overall
		prefs.put("profile.password_manager_enabled", false);

		// Add the preferences map to ChromeOptions
		options.setExperimentalOption("prefs", prefs);

		// Initialize the ChromeDriver with the configured options
		driver = new ChromeDriver(options);

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.dolibarr.org/#lastnews");
		return driver;

	}

	public void maximize() {
		driver.manage().window().maximize();

	}

	public void quit() {
		driver.quit();

	}

	public void clickElement(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();

	}

	public void sendKeys(WebElement element, String s) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(s);

	}

	public String getText(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();

	}

	public void Arrowup(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.ARROW_UP);

	}

	public void ArrowDown(WebElement element) {
		element.sendKeys(Keys.ARROW_DOWN);

	}

	public void alert() {
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}

	public void dropDown(WebElement element, String s) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		Select select = new Select(element);
		select.selectByVisibleText(s);

	}

	public String getvalue(WebElement element, String s) {
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();

	}

	public static String screenShot(WebDriver driver, String screenshotName) {
		String timestamp = new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date());
		String filepath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + "_" + timestamp + ".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(filepath);
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			throw new RuntimeException("Failed to save screenshot", e);
		}
		return filepath;

	}
	public void moveToElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public void WindowHandletoChild() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);

	}
	public void enterKey(WebElement element) {
	wait.until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(Keys.ENTER);

	}
	
	public void switchToFrame(WebElement element) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		
		
		

	}
	public void SwitchtoParentFrame() {
		driver.switchTo().parentFrame();

	}
	
		

	}


