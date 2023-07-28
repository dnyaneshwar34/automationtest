package technical.technical1;





import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import uioj.LIsten;




public class Testbase {
	
	public static WebDriver driver;
	 public static LIsten listenobj;
	public static YOUTUBE youtubobj;
	public static Logger logger;
	
    @BeforeClass
	public void start() {
	
		logger = Logger.getLogger("automation started");
		PropertyConfigurator.configure("Log4j2.properties");
		logger.info("framework started");
	}
	
    @AfterClass
    public void stop() {
    	
    	logger.info("framework stopped");
    }
    
   @Parameters("browser")
   @BeforeMethod
   public void setup(String br) {
	   if(br.equalsIgnoreCase("chrome")) {
		   ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);}
	   else if (br.equalsIgnoreCase("firefox")) {
		   
		   driver = new FirefoxDriver();
		   
	   }
	   else {
		   System.out.println("provide current browser");
	   }
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.get("https://www.youtube.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	   youtubobj = new YOUTUBE();
	   listenobj = new  LIsten();
   }
   
   @AfterMethod
  public void tear () throws InterruptedException {
	  
	  driver.quit();
	  logger.info("browser stopped");
  }
}
