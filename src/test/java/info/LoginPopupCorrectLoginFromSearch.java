package info;


import org.testng.annotations.*;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class LoginPopupCorrectLoginFromSearch {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = {"CUR2"})
    public void loginBetGamesTvTest() throws Exception {
        casinoPage.search(exampleBundle.getString("bet_games_tv_game"));
        casinoPage.clickPlayButton(casinoPage.getBetGamesTvSearchResultGameElement());
        casinoPage.correctLoginByPopup(exampleBundle.getString("correct_login"), exampleBundle.getString("correct_password"));
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
    }

}



