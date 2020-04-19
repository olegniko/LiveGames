package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class LoginPopupAppearenceFromLobby {

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



    @Test(groups = { "CUR2"})
    public void loginPopupAppearenceBetGamesTVTest() throws Exception {
        casinoPage.clickPlayButton(casinoPage.getBetGamesTvGameElement());
        assertTrue(casinoPage.getLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupElement().isEnabled());
        casinoPage.closeLoginPopup();
    }


}


