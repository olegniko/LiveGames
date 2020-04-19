package helper;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class WebDriverSingleton {


    public static WebDriver init() {

        String browser = System.getProperty("browser", "chrome");
        WebDriverFactory factory;


        switch (browser) {
            case ("chrome"): {

                factory = new ChromeDriverFactory();
                /* MyLogger.info("Chrome selected");*/
                break;

            }
            case ("firefox"): {

                factory = new FirefoxDriverFactory();
                /*MyLogger.info("Firefox selected");*/
                break;
            }

            default:

                factory = new ChromeDriverFactory();
                /*MyLogger.info("Chrome selected");*/
                break;
        }

        try {

            return factory.create();

        } catch (MalformedURLException e) {

            throw new RuntimeException("Failed to init browser", e);

        }


    }

    public static void kill(WebDriver driver) {

        driver.quit();
    }
}

