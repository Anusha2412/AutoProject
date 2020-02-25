package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

  public static WebDriver driver;

private String browser = "";
  public void openBrowser(){

      if (browser == "chrome")  {
           driver = new ChromeDriver();
          WebDriverManager.chromedriver().setup();
      }
      else {
          driver = new FirefoxDriver();
          WebDriverManager.firefoxdriver().setup();

      }
  }

  public void maxiBrowser(){
      driver.manage().window().maximize();
  }
  public void navigateTo(String url){
      driver.get(url);
  }

  public void closeBrowser(){
      driver.quit();
  }

  public void applyImplicitWait(){

      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  }
}
