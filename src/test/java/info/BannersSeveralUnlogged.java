package info;

import org.testng.annotations.*;
import pages.CasinoPage;

import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class BannersSeveralUnlogged {

    CasinoPage casinoPage;


    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
        casinoPage.openCategory();
        casinoPage.refreshPage();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = {"CUR2"})
    public void leftArrowEnabledTest() throws Exception {
        assertTrue(casinoPage.getBannerLeftArrowElement().isDisplayed());
        assertTrue(casinoPage.getBannerLeftArrowElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void rightArrowEnabledTest() throws Exception {
        assertTrue(casinoPage.getBannerRightArrowElement().isDisplayed());
        assertTrue(casinoPage.getBannerRightArrowElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void dotNoneEnabledTest() throws Exception {
        assertTrue(casinoPage.getDotNoneElement().isDisplayed());
        assertTrue(casinoPage.getDotNoneElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void dotOpenUrlEnabledTest() throws Exception {
        assertTrue(casinoPage.getDotOpenUrlElement().isDisplayed());
        assertTrue(casinoPage.getDotOpenUrlElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void clickDotNoneEnabledTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestOpenURLSeveralElement(),10,1);
        casinoPage.clickElement(casinoPage.getDotNoneElement());
        assertTrue(casinoPage.getBannerAutotestNoneSeveralElement().isDisplayed());
    }

    @Test(groups = {"CUR2"})
    public void clickDotOpenUrlEnabledTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestNoneSeveralElement(),10,1);
        casinoPage.clickElement(casinoPage.getDotOpenUrlElement());
        assertTrue(casinoPage.getBannerAutotestOpenURLSeveralElement().isDisplayed());
    }


    @Test(groups = {"CUR2"})
    public void clickRightArrowFromNoneEnabledTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestOpenURLSeveralElement(),10,1);
        casinoPage.clickElement(casinoPage.getBannerRightArrowElement());
        assertFalse(casinoPage.getBannerAutotestOpenURLSeveralElement().isDisplayed());
    }

    @Test(groups = {"CUR2"})
    public void clickLeftArrowToNoneEnabledTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestOpenURLSeveralElement(),10,1);
        casinoPage.clickElement(casinoPage.getBannerLeftArrowElement());
        assertTrue(casinoPage.getBannerAutotestNoneSeveralElement().isDisplayed());
    }

  }


