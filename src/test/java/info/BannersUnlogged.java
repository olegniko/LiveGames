package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class BannersUnlogged {

    CasinoPage casinoPage;


    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
        casinoPage.openCategory();
        casinoPage.refreshPage();
    }


    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }



    @Test(groups = {"CUR2"})
    public void bannerNonePresenseTest() throws Exception {
        casinoPage.waitForBanner(casinoPage.getBannerAutotestNoneElement());
        assertTrue(casinoPage.getBannerAutotestNoneElement().isDisplayed());
    }

    @Test(groups = {"CUR2"})
    public void bannerOpenUrlPresenseTest() throws Exception {
        casinoPage.waitForBanner(casinoPage.getBannerAutotestOpenURLElement());
        assertTrue(casinoPage.getBannerAutotestOpenURLElement().isDisplayed());
    }

}


