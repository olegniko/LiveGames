package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class LoginHeaderCorrectLogin {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
        casinoPage.correctLogin(exampleBundle.getString("correct_login"), exampleBundle.getString("correct_password"));
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = {"CUR2"})
    public void myAccountButtonEnabledTest() throws Exception {
        assertTrue(casinoPage.getMyAccountButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getMyAccountButtonHeaderElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void depositButtonEnabledTest() throws Exception {
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getDepositButtonHeaderElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void logoutButtonEnabledTest() throws Exception {
        assertTrue(casinoPage.getLogoutButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLogoutButtonHeaderElement().isEnabled());
    }
}


