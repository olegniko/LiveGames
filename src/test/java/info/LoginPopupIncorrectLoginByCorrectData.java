package info;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LoginPopupIncorrectLoginByCorrectData {

    CasinoPage casinoPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
        casinoPage.clickElement(casinoPage.getBetGamesTvGameElement());
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {

        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = {"CUR2"},alwaysRun = true)
    public void corectLoginByAccountNumberTest() throws Exception {
        casinoPage.loginByPopup(exampleBundle.getString("correct_login_account_number"), exampleBundle.getString("correct_password"));
        assertEquals(casinoPage.getTextIncorrectLoginMessagePopupElement(),exampleBundle.getString("incorrect_login_by_correct_data_message"));
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"CUR2"},alwaysRun = true)
    public void corectLoginByEmailTest() throws Exception {
        casinoPage.loginByPopup(exampleBundle.getString("correct_login_email"), exampleBundle.getString("correct_password"));
        String parentWindow = casinoPage.getParentWindow();
        casinoPage.switchToFrame(casinoPage.getiFrameCaptchaPopupElement());
        assertTrue(casinoPage.getCaptchaPopupElement().isDisplayed());
        casinoPage.switchToParentFrame(parentWindow);
        casinoPage.closeLoginPopup();
    }
}


