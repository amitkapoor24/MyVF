package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

    protected static WebDriver driver;


    public DriverFactory() {
        initialize();
    }

    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    private void createNewDriverInstance() {
        String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("chrome")) {
        	System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");
        	driver=new ChromeDriver();
        	
        } 
        else if (browser.equals("firefox")){
       
        	driver = new FirefoxDriver();        	
        }
        else if (browser.equals("ie")){
        	System.setProperty("webdriver.ie.driver", "src/IEDriverServer2.exe");
        	DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        	  caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        	  caps.setCapability("nativeEvents", false);    
        	  caps.setCapability("unexpectedAlertBehaviour", "accept");
        	  caps.setCapability("ignoreProtectedModeSettings", true);
        	  caps.setCapability("disable-popup-blocking", true);
        	  caps.setCapability("enablePersistentHover", true);
  	  
        	driver = new InternetExplorerDriver(caps);
        	
        }
        else {
            System.out.println("can't read browser type");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}