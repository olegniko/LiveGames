package info;

import org.testng.annotations.*;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class BannersSeveralLogged {

    CasinoPage casinoPage;


    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
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
    public void dotNoneActiveTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestNoneSeveralElement(),12,1);
        assertTrue(casinoPage.getActiveDotNoneElement().isDisplayed());
        assertTrue(casinoPage.getActiveDotNoneElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void dotOpenUrlActiveTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestOpenURLSeveralElement(),12,1);
        assertTrue(casinoPage.getActiveDotOpenUrlElement().isDisplayed());
        assertTrue(casinoPage.getActiveDotOpenUrlElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void dotNoneNotActiveTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestOpenURLSeveralElement(),12,1);
        assertTrue(casinoPage.getNotActiveDotOpenUrlElement().isDisplayed());
        assertTrue(casinoPage.getNotActiveDotOpenUrlElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void dotOpenUrlNotActiveTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestNoneSeveralElement(),12,1);
        assertTrue(casinoPage.getNotActiveDotNoneElement().isDisplayed());
        assertTrue(casinoPage.getNotActiveDotNoneElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void clickDotNoneTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestOpenURLSeveralElement(),12,1);
        casinoPage.clickElement(casinoPage.getNotActiveDotNoneElement());
        assertTrue(casinoPage.getNotActiveDotOpenUrlElement().isDisplayed());
        assertTrue(casinoPage.getNotActiveDotOpenUrlElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void clickdotOpenUrlTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestNoneSeveralElement(),12,1);
        casinoPage.clickElement(casinoPage.getNotActiveDotOpenUrlElement());
        assertTrue(casinoPage.getNotActiveDotNoneElement().isDisplayed());
        assertTrue(casinoPage.getNotActiveDotNoneElement().isEnabled());
    }





    @Test(groups = {"CUR2"})
    public void clickRightArrowFromNoneEnabledTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestNoneSeveralElement(),10,1);
        casinoPage.clickElement(casinoPage.getBannerRightArrowElement());
        assertTrue(casinoPage.getBannerAutotestOpenURLSeveralElement().isDisplayed());
    }

    @Test(groups = {"CUR2"})
    public void clickLeftArrowToNoneEnabledTest() throws Exception {
        casinoPage.waitIfElementIsEnabledFluent(casinoPage.getBannerAutotestOpenURLSeveralElement(),10,1);
        casinoPage.clickElement(casinoPage.getBannerLeftArrowElement());
        assertTrue(casinoPage.getBannerAutotestNoneSeveralElement().isDisplayed());
    }

}


