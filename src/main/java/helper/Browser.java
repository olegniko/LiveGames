package helper;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


public class Browser {

    public static WebDriver driver;
    public static Locale locale;
    public static Locale localeServer;
    public static ResourceBundle exampleBundle;
    public static ResourceBundle exampleBundleServer;
    protected static Logger commonSettings;

    String url;

    public WebDriver init() {
        if (Objects.isNull(driver)) {
            driver = WebDriverSingleton.init();
        }
        return driver;
    }


    public static void initLogger(String name) {
        commonSettings = Logger.getLogger(name);
    }

    public static void info(String message) {
        commonSettings.info(message);
    }


    public void open() throws Exception {
        initLogger("Common Settings");
        locale = new Locale(System.getProperty("locale"));
        commonSettings.info(locale + " as locale is selected");
        exampleBundle = ResourceBundle.getBundle("ResourceBundle", locale);
        url = exampleBundle.getString("url");
        commonSettings.info(url + " is opening");
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void close() {
        WebDriverSingleton.kill(driver);
        driver = null;
        commonSettings.info(url + " is closed");
    }


    public static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void driverWait(int time) {

        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

    }


    public void refreshPage() {

        driver.navigate().refresh();
    }


    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
        String path = fileWithPath;
        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile = new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);
        initLogger("Screenshot " + path + " is made");
    }

    static public int count = 1;

    public static void takeSnapShot() throws Exception {
        String path = "./target/screenshots/" + count + ".png";
        takeSnapShot(driver, path);
        count = count + 1;
        initLogger("Screenshot " + path + " is made");
    }
}






