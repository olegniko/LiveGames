package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Page404 {

    CasinoPage casinoPage;


    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
        casinoPage.correctLogin(exampleBundle.getString("correct_login"), exampleBundle.getString("correct_password"));
        casinoPage.enterUrl(exampleBundle.getString("404_url"));
    }


    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }



    @Test(groups = { "CUR2"})
    public void body404Test() throws Exception {
        assertTrue(casinoPage.getNotFoundBody404Element().isDisplayed());
        assertEquals(casinoPage.getTextNotFoundBody404Element(),exampleBundle.getString("404_body"));
    }

    @Test(groups = { "CUR2"})
    public void title404Test() throws Exception {
        assertTrue(casinoPage.getNotFoundTitle404Element().isDisplayed());
        assertEquals(casinoPage.getTextNotFoundTitle404Element(),exampleBundle.getString("404_title"));
    }

    @Test(groups = { "CUR2"})
    public void button404Test() throws Exception {
        assertTrue(casinoPage.getNotFoundButton404Element().isDisplayed());
        assertEquals(casinoPage.getTextNotFoundButton404Element(),exampleBundle.getString("404_button"));
    }

    @Test(groups = { "CUR2"})
    public void url404Test() throws Exception {
        String currentUrl=casinoPage.getUrl();
        assertEquals(currentUrl,exampleBundle.getString("404_url_result"));
    }

    @Test(groups = { "CUR2"},priority = 2)
    public void goToLobby404Test() throws Exception {
        casinoPage.clickElement(casinoPage.getNotFoundButton404Element());
        String currentUrl=casinoPage.getUrl();
        assertEquals(currentUrl,exampleBundle.getString("url"));
    }


}


