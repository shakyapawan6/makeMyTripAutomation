package com.makeMyTrip.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends Data {

	public static WebDriver driver;
	
	public static void setUP(String browser, String url, int time) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\resources\\drivers\\geckodriver.exe");
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.IEDriverServer.driver",
					System.getProperty("user.dir") + "\\src\\resources\\drivers\\IEDriverServer.exe");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void tearUp() {
		driver.quit();
	}

}
