package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LoginHeaderElements {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }



    @Test(groups = {"CUR2"})
    public void loginFieldEnabledTest() throws Exception {
        assertTrue(casinoPage.getLoginFieldHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLoginFieldHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLoginFieldHeaderElement(), exampleBundle.getString("login_field_header"));
    }

    @Test(groups = {"CUR2"})
    public void passwordFieldEnabledTest() throws Exception {
        assertTrue(casinoPage.getPasswordFieldHeaderElement().isDisplayed());
        assertTrue(casinoPage.getPasswordFieldHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextPasswordFieldHeaderElement(), exampleBundle.getString("password_field_header"));
    }

    @Test(groups = {"CUR2"})
    public void lostPasswordEnabledTest() throws Exception {
        assertTrue(casinoPage.getLostPasswordHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLostPasswordHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLostPasswordHeaderElement(), exampleBundle.getString("lost_password_header"));
    }

    @Test(groups = {"CUR2"})
    public void loginButtonEnabledTest() throws Exception {
        assertTrue(casinoPage.getLoginButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLoginButtonHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLoginButtonHeaderElement(), exampleBundle.getString("login_button_header"));
    }


    @Test(groups = {"CUR2"})
    public void joinNowButtonEnabledTest() throws Exception {
        assertTrue(casinoPage.getJoinNowButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getJoinNowButtonHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextJoinNowButtonHeaderElement(), exampleBundle.getString("join_now_button_header"));
    }
}


