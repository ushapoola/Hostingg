package Executions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class Coding extends Reused {

	public void log() throws InterruptedException {
		driver.get("https://www.inmotionhosting.com/");
		T(2);
	}
	public  void Functional_Text() throws InterruptedException {
		
	
	System.out.println(driver.getTitle());
	Actions a=new Actions(driver);
	
	T(2);
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
	xp("Hos").click();
	String s=driver.getTitle();
	System.out.println(s);
	if(s.equals("Shared Hosting: Buy Shared Hosting Services | InMotion Hosting")) {
		
		System.out.println("Yes, It is valid");
	}
	else {
		System.out.println("No, It is Invalid");
	}
	
	T(2);
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,700)");
	xp("Sh").click();
	String After_Addcart=driver.getCurrentUrl();
	System.out.println(After_Addcart);
	
	if(After_Addcart.equals("https://www.inmotionhosting.com/shared-hosting")) {
	System.out.println("Yes, Succesfully after add cart");	
	}
	else {
		System.out.println("No,Unsuccesfully");
	}
	driver.navigate().back();
	}
	
	public void Login_Test() throws InterruptedException {
		Actions ac=new Actions(driver);
		xp("Lo").click();

		xp("User").sendKeys("ushapoola48@gmail.com");
		xp("Pass").sendKeys("Usha@123");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
		driver.switchTo().frame(0);
		xp("Cap").click();//captcha is not allow for auomation testing
		T(2);
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
//		ac.moveToElement(xp("Log1")).click().perform();
//		String d=xp("pop").getText();
//		System.out.println(d);
		driver.navigate().back();
	}
	
	public void UI_Test() throws InterruptedException {
		
		driver.navigate().back();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",xp("Scrol"));
		
		System.out.println("After Validate the Scrollbar");
		xp("Scrol").sendKeys("Launch");
		System.out.println("--After validate the ");
		xp("Go").click();
		driver.navigate().back();
		
	}
}
