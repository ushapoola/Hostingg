package Executions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Reused extends Execute {

	
	public void T(int i) throws InterruptedException {
		int x=1000*i;
		Thread.sleep(x);
		
	}
	
	public WebElement xp(String x) {
		
	return	driver.findElement(By.xpath(obj.getProperty(x)));
	}
	
}
