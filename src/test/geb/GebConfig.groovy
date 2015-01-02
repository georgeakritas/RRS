import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import java.util.logging.Level
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

driver =  //"htmlunit"

{
	/*********************************************
	 * Delete everything below this box
	 *********************************************/
	
	Map<String, Object> deviceMetrics = new HashMap<String, Object>();
	Map<String, Object> mobileEmulation = new HashMap<String, Object>();
	mobileEmulation.put("deviceName", "Apple iPhone 5");
	Map<String, Object> chromeOptions = new HashMap<String, Object>();
	chromeOptions.put("mobileEmulation", mobileEmulation);
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	File file =new File("src/main/resource/chromedriver.exe");
	String Filestring = file.getAbsolutePath().replace("\\", "/");
	System.setProperty("webdriver.chrome.driver",
				Filestring); // Here mention the path
	RemoteWebDriver driver = new ChromeDriver(capabilities);
	driver

		
	/*********************************************
	 * Delete everything above this box
	 *********************************************/
}