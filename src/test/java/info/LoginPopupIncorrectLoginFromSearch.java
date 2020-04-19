package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class LoginPopupIncorrectLoginFromSearch {

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
    public void incorectLoginTest() throws Exception {
        casinoPage.search(exampleBundle.getString("bet_games_tv_game"));
        casinoPage.clickElement(casinoPage.getBetGamesTvSearchResultGameElement());
        casinoPage.loginByPopup(exampleBundle.getString("incorrect_login"), exampleBundle.getString("correct_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"CUR2"})
    public void incorectPasswordTest() throws Exception {
        casinoPage.search(exampleBundle.getString("bet_games_tv_game"));
        casinoPage.clickElement(casinoPage.getBetGamesTvSearchResultGameElement());
        casinoPage.loginByPopup(exampleBundle.getString("correct_login"), exampleBundle.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"CUR2"})
    public void incorectLoginAndPasswordTest() throws Exception {
        casinoPage.search(exampleBundle.getString("bet_games_tv_game"));
        casinoPage.clickElement(casinoPage.getBetGamesTvSearchResultGameElement());
        casinoPage.loginByPopup(exampleBundle.getString("incorrect_login"), exampleBundle.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"CUR2"})
    public void blankLoginAndPasswordTest() throws Exception {
        casinoPage.search(exampleBundle.getString("bet_games_tv_game"));
        casinoPage.clickElement(casinoPage.getBetGamesTvSearchResultGameElement());
        casinoPage.loginByPopup("", "");
        assertTrue(casinoPage.getLoginRequiredElement().isDisplayed());
        assertTrue(casinoPage.getPasswordRequiredElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"CUR2"})
    public void blankLoginTest() throws Exception {
        casinoPage.search(exampleBundle.getString("bet_games_tv_game"));
        casinoPage.clickElement(casinoPage.getBetGamesTvSearchResultGameElement());
        casinoPage.loginByPopup("", exampleBundle.getString("correct_password"));
        assertTrue(casinoPage.getLoginRequiredElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"CUR2"})
    public void blankPasswordTest() throws Exception {
        casinoPage.search(exampleBundle.getString("bet_games_tv_game"));
        casinoPage.clickElement(casinoPage.getBetGamesTvSearchResultGameElement());
        casinoPage.loginByPopup(exampleBundle.getString("correct_login"), "");
        assertTrue(casinoPage.getPasswordRequiredElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

}


