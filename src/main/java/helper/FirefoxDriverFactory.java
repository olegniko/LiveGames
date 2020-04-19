package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

/**
 * Created by User on 03.01.2019.
 */
public class FirefoxDriverFactory extends WebDriverFactory {
    @Override
    public WebDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("71.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(
                    URI.create("http://localhost:4444/wd/hub").toURL(),
                    capabilities
            );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }


}


//This is how to launch tests via WebDriverManager

        /*WebDriverManager.firefoxdriver().forceCache().setup();
        return new FirefoxDriver();*/
