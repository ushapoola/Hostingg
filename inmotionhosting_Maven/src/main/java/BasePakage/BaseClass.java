package BasePakage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	public static Properties obj;
  @BeforeMethod
  public void BC() throws IOException {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
driver=new ChromeDriver();

driver.manage().window().maximize();
  obj=new Properties();
  FileInputStream fil=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\inmotionhosting_Maven\\src\\data\\java\\data");
  
    obj.load(fil);
    
  }
}
