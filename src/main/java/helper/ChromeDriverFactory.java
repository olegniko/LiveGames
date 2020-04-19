package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;


/**
 * Created by User on 03.01.2019.
 */
public class ChromeDriverFactory extends WebDriverFactory {

    @Override
    public WebDriver create() {

        ChromeOptions options = new ChromeOptions();
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        options.setCapability("enableVNC", true);
        options.setCapability("enableVideo", false);
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(URI.create(System.getProperty("selenoidUrl")).toURL(), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

}
// To change a way of launching, need to replace part of code below

//This is how to launch tests via Selenoid

        /* DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("79.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(
                    URI.create(System.getProperty("selenoidUrl")).toURL(),
                    capabilities
            );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;*/


//This is how to launch tests via WebDriverManager

       /* WebDriverManager.chromedriver().forceCache().setup();
       return new ChromeDriver();*/


//This is how to launch Selenium Grid

             /*  ChromeOptions chromeOptions = new ChromeOptions();
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(
                    URI.create("http://mh-minsktest01.mara.local:4444/wd/hub").toURL(),
                    chromeOptions
            );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;*/