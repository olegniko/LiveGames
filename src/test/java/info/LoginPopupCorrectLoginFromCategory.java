package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class LoginPopupCorrectLoginFromCategory {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
        casinoPage.openCategory();
    }


    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = { "CUR2"})
    public void loginBtGamesTvTest() throws Exception {
        casinoPage.clickPlayButton(casinoPage.getBetGamesTvGameElement());
        casinoPage.correctLoginByPopup(exampleBundle.getString("correct_login"), exampleBundle.getString("correct_password"));
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
    }

}



