package pages;


import helper.Browser;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public abstract class BasePage {

    public Browser browser;
    public WebDriver driver;
    public static Logger initLogger;

    public static void initLogger(String name) {
        initLogger = Logger.getLogger(name);
    }


    public static void info(String message) {
        initLogger.info(message);
    }

    public static void error(String message) {
        initLogger.error(message);
    }


    public BasePage() throws Exception {
        initLogger("Elements and Methods");
        browser = new Browser();
        driver = browser.init();
        browser.open();
        PageFactory.initElements(driver, this);
        driverWait(4);
    }


    public void close() {
        browser.close();
    }


    public void waitIfElementIsClickable(WebElement element, int time) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e1) {
            initLogger.error("Fail of waiting for clickable element " + element + e1.getCause());
        }

    }



    public void waitElement(WebElement element) throws Exception {
        waitIfElementIsClickableFluent(element);
    }
    public void waitIfElementIsSelected(WebElement element, int time) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.elementToBeSelected(element));
        } catch (Exception e1) {
            initLogger.error("Fail of waiting for selected element " + element + e1.getCause());
        }
    }

    public void waitIfElementIsSelected(WebElement element) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeSelected(element));
        } catch (Exception e1) {
            initLogger.error("Fail of waiting for selected element " + element + e1.getCause());
        }

    }

    public void waitIfElementIsClickable(WebElement element) throws Exception {
        try {
            waitIfElementIsClickable(element, 20);
        } catch (Exception e1) {
            initLogger.error("Fail of waiting for clickable element " + element + e1.getCause());
        }
    }

    public void waitIfElementIsEnabled(WebElement element, int time) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e1) {
            initLogger.error("Fail of waiting for enabled element " + element + e1.getCause());
        }
    }



    public void waitIfOneOfElementsAreVisible(WebElement element, WebElement element2, int Timeout, int Polling) throws Exception {
        try {
            Wait wait = new FluentWait(driver)
                    .withTimeout(Duration.ofSeconds(Timeout))
                    .pollingEvery(Duration.ofSeconds(Polling))
                    .ignoring(Exception.class);
            wait.until(
                    ExpectedConditions.or(
                    ExpectedConditions.visibilityOf(element),
                    ExpectedConditions.visibilityOf(element2)
                    )
            );
        } catch (Exception e1) {
            initLogger.error("Fail of waiting for enabled element " + element + e1.getCause());
        }
    }

    public void waitIfElementIsEnabled(WebElement element) throws Exception {
        try {
            waitIfElementIsEnabled(element, 30);
        } catch (Exception e1) {
            initLogger.error("Fail of waiting for enabled element " + element + e1.getCause());
        }
    }

    public void waitIfElementIsClickableFluent(WebElement element, int Timeout, int Polling) throws Exception {
        try {
            Wait wait = new FluentWait(driver)
                    .withTimeout(Duration.ofSeconds(Timeout))
                    .pollingEvery(Duration.ofSeconds(Polling))
                    .ignoring(Exception.class);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e1) {
            initLogger.error("Fail of waiting for clickable element " + element + e1.getCause());
        }
    }

    public void waitIfElementIsEnabledFluent(WebElement element, int Timeout, int Polling) throws Exception {
        try {
            Wait wait = new FluentWait(driver)
                    .withTimeout(Duration.ofSeconds(Timeout))
                    .pollingEvery(Duration.ofSeconds(Polling))
                    .ignoring(Exception.class);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e1) {
            initLogger.error("Fail of waiting for enabled element " + element + e1.getCause());
        }
    }

    public void waitIfElementIsClickableFluent(WebElement element) throws Exception {
        waitIfElementIsClickableFluent(element, 40, 1);
    }


    public WebElement getClickableElement(WebElement element) throws Exception {
        waitIfElementIsClickableFluent(element);
        return element;
    }

    public WebElement getEnabledElement(WebElement element) throws Exception {
        waitIfElementIsEnabled(element);
        return element;
    }

    public WebElement getClickableFluentElement(WebElement element) throws Exception {
        waitIfElementIsClickableFluent(element);
        return element;
    }


    public void clickIfElementIsClickable(WebElement element) throws Exception {
        waitIfElementIsClickable(element);
        element.click();
    }

    public void clickIfElementIsClickableFluent(WebElement element) throws Exception {
        waitIfElementIsClickableFluent(element);
        element.click();
    }

    public void clickIfElementIsEnabled(WebElement element) throws Exception {
        waitIfElementIsEnabled(element);
        element.click();
    }

    public void clearField(WebElement element) throws Exception {
        waitIfElementIsClickableFluent(element);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }


    public WebElement getElement(WebElement element) {
        return element;
    }

    public boolean isElementClickable(WebElement element) throws Exception {
        try {
            waitIfElementIsClickable(element);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }




    public void moveToElement(WebElement element) {
        new Actions(driver).moveToElement(element).build().perform();
    }

    public void clickElementByCoordinates(int x, int y) {
        new Actions(driver).moveByOffset(x, y).click().build().perform();
    }

    public void refreshPage() {
        driverWait(4);
        driver.navigate().refresh();
        initLogger.info("Page refresh is made ");
        driverWait(4);
    }

    public void refreshPage2() {
        driver.navigate().to(driver.getCurrentUrl());
    }


    public String getNextTabUrlPage() throws InterruptedException {
        driverWait(3);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        String url = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return url;
    }

    public String getUrl() throws InterruptedException {
        driverWait(3);
        String url = driver.getCurrentUrl();
        return url;
    }

    public void driverWait(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        initLogger.info("Implicit wait for " + time + " seconds");
    }

    public void switchToFrame(WebElement element) throws Exception {
        waitIfElementIsClickableFluent(element, 50, 5);
        initLogger.info("Frame is clickable ");
        driver.switchTo().frame(element);
    }

   public String getParentWindow(){
        return driver.getWindowHandle();
   }

   public void switchToParentFrame(String parentWindow) {
       driver.switchTo().window(parentWindow);
   }


    public void switchToPopup() throws Exception {
        driver.switchTo().activeElement();
    }


    public String removeLastSymbol(String str) {
        String strWithoutLastSymbol = str.substring(0, str.length() - 1);
        return strWithoutLastSymbol;
    }

    public Double getAndFormatBalanceToDouble() {
        String str= getBalance();
        String strNew1 = str.replace(",", "");
        return Double.parseDouble(strNew1);
    }
     public String getBalance(){
        WebElement element= driver.findElement(By.xpath("//span[@data-punter-balance-type='main']//ancestor::a/span"));
        String data = element.getText();
        return data;
     }

}
