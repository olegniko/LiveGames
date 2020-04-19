package info;


import org.testng.annotations.*;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;


public class FooterElementLinks {

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
    public void manCityLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getManCityElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("man_city_url"));
    }

    @Test(groups = {"CUR2"})
    public void sevilyaLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getSevillaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("sevilya_url"));
    }

    @Test(groups = {"CUR2"})
    public void gironaLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getGironaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("girona_url"));
    }

    /*@Test(groups = {"CUR2"})
    public void dinamoLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getDinamoElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("dinamo_url"));
    }*/

    @Test(groups = {"CUR2"})
    public void karpatyLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getKarpatyElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("karpaty_url"));
    }

    @Test(groups = {"CUR2"})
    public void zaragozaLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getZaragozaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("zaragoza_url"));
    }


    @Test(groups = {"CUR2"})
    public void facebookLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getFacebookIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("facebook_url"));
    }

    @Test(groups = {"CUR2"})
    public void twitterLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getTwitterIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("twitter_url"));
    }


    @Test(groups = {"CUR2"})
    public void shutterstockLinkLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getShutterstockLinkElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("shutterstockLink_url"));
    }

}

