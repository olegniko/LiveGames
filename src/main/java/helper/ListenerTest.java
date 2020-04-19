package helper;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static helper.Browser.driver;
import static helper.Browser.takeSnapShot;

public class ListenerTest implements ITestListener {
    public static Logger test;

    public static void initLogger(String name) {
        test = Logger.getLogger(name);
    }

    public ListenerTest() {
        initLogger("Test");
    }


    public static void info(String message) {
        test.info(message);
    }

    public static void error(String message) {
        test.error(message);
    }


    @Override
    public void onFinish(ITestContext Result) {
    }

    @Override
    public void onStart(ITestContext Result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
        test.error("Test Failed but within success percentage " + Result.getName());
    }

    // When Test case get failed, this method is called.

    @Override
    public void onTestFailure(ITestResult Result) {
        test.error(Result.getName() + "is failed ");
        try {
            takeSnapShot(driver, "./target/screenshots/" + Result.getName() + ".png");
            test.error("Screenshot is made");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // When Test case get Skipped, this method is called.
    }

    @Override
    public void onTestSkipped(ITestResult Result) {
        test.error(Result.getName() + " is skipped ");
    }

    // When Test case get Started, this method is called.
    @Override
    public void onTestStart(ITestResult Result) {
        test.info(Result.getName() + " is started ");
    }


    // When Test case get passed, this method is called.
    @Override
    public void onTestSuccess(ITestResult Result) {
        test.info(Result.getName() + " is successfully finished ");
    }

}
