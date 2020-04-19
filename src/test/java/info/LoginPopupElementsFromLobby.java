package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LoginPopupElementsFromLobby {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
        casinoPage.clickPlayButton(casinoPage.getBetGamesTvGameElement());
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        casinoPage.closeLoginPopup();
        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = {"CUR2"})
    public void loginPopupTitleTest() throws Exception {
        assertTrue(casinoPage.getLoginPopupTitleElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupTitleElement().isEnabled());
        assertEquals(casinoPage.getTextLoginPopupTitleElement(), exampleBundle.getString("login_title_popup"));
    }

    @Test(groups = {"CUR2"})
    public void loginFieldPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getLoginFieldLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginFieldLoginPopupElement().isEnabled());
        assertEquals(casinoPage.getTextLoginFieldLoginPopupElement(), exampleBundle.getString("login_field_popup"));
    }

    @Test(groups = {"CUR2"})
    public void passwordFieldPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getPasswordFieldLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getPasswordFieldLoginPopupElement().isEnabled());
        assertEquals(casinoPage.getTextPasswordFieldLoginPopupElement(), exampleBundle.getString("password_field_popup"));
    }

    @Test(groups = {"CUR2"})
    public void loginButtonPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getLoginButtonPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginButtonPopupElement().isEnabled());
        assertEquals(casinoPage.getTextLoginButtonPopupElement(), exampleBundle.getString("login_button_popup"));
    }

    @Test(groups = {"CUR2"})
    public void joinNowButtonPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getJoinNowButtonPopupElement().isDisplayed());
        assertTrue(casinoPage.getJoinNowButtonPopupElement().isEnabled());
        assertEquals(casinoPage.getTextJoinNowButtonPopupElement(), exampleBundle.getString("join_now_button_popup"));
    }

    @Test(groups = {"CUR2"})
    public void lostPasswordPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getLostPasswordLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLostPasswordLoginPopupElement().isEnabled());
        assertEquals(casinoPage.getTextLostPasswordLoginPopupElement(), exampleBundle.getString("lost_password_popup"));
    }
}


