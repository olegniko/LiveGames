package helper;

import org.apache.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListenerSuite implements ISuiteListener {
    public static Logger suiteOfTests;

    public static void initLogger(String name) {
        suiteOfTests = Logger.getLogger(name);
    }

    public ListenerSuite() {
        initLogger("Suite");
    }


    public static void info(String message) {
        suiteOfTests.info(message);
    }

    public static void error(String message) {
        suiteOfTests.error(message);
    }

    @Override
    public void onStart(ISuite suite) {
        suiteOfTests.info(suite.getName() + " suite is started ");
    }

    @Override
    public void onFinish(ISuite suite) {
        suiteOfTests.info(suite.getName() + " suite is successfully finished ");
    }


}
