package info;

import org.testng.annotations.*;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class BannersLoggedActions {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
        casinoPage.openCategory();
        casinoPage.correctLogin(exampleBundle.getString("correct_login"), exampleBundle.getString("correct_password"));
        casinoPage.refreshPage();
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
    public void bannerNoneActionTest() throws Exception {
        casinoPage.clickBanner(casinoPage.getBannerAutotestNoneElement());
        casinoPage.waitForBanner(casinoPage.getBannerAutotestNoneElement());
        assertTrue(casinoPage.getBannerAutotestNoneElement().isDisplayed());
        assertTrue(casinoPage.getBannerAutotestNoneElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void bannerOpenUrlActionTest() throws Exception {
        casinoPage.clickBanner(casinoPage.getBannerAutotestOpenURLElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("banner_url"));
    }

   }


