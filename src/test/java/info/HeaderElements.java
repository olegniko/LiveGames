package info;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class HeaderElements {

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
    public void sportEnabledTest() {
        assertTrue(casinoPage.getSportHeaderElement().isDisplayed());
        assertTrue(casinoPage.getSportHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextSportHeaderElement(), exampleBundle.getString("sport_header"));
    }

    @Test(groups = {"CUR2"})
    public void liveEnabledTest() {
        assertTrue(casinoPage.getLiveHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLiveHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLiveHeaderElement(), exampleBundle.getString("live_header"));
    }

    @Test(groups = {"CUR2"})
    public void totoEnabledTest() {
        assertTrue(casinoPage.getTotoHeaderElement().isDisplayed());
        assertTrue(casinoPage.getTotoHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextTotoHeaderElement(), exampleBundle.getString("toto_header"));
    }

    @Test(groups = {"CUR2"})
    public void casinoEnabledTest() {
        assertTrue(casinoPage.getCasinoHeaderElement().isDisplayed());
        assertTrue(casinoPage.getCasinoHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextCasinoHeaderElement(), exampleBundle.getString("casino_header"));
    }

    @Test(groups = {"CUR2"})
    public void liveCasinoEnabledTest() {
        assertTrue(casinoPage.getLiveCasinoHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLiveCasinoHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLiveCasinoHeaderElement(), exampleBundle.getString("live_casino_header"));
    }

    @Test(groups = {"CUR2"})
    public void eSportEnabledTest() {
        assertTrue(casinoPage.getESportHeaderElement().isDisplayed());
        assertTrue(casinoPage.getESportHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextESportHeaderElement(), exampleBundle.getString("e_sport_header"));
    }

    @Test(groups = {"CUR2"})
    public void constructorEnabledTest() {
        assertTrue(casinoPage.getConstructorHeaderElement().isDisplayed());
        assertTrue(casinoPage.getConstructorHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextConstructorHeaderElement(), exampleBundle.getString("constructor_header"));
    }

    @Test(groups = {"CUR2"})
    public void virtualsEnabledTest() {
        assertTrue(casinoPage.getVirtualsHeaderElement().isDisplayed());
        assertTrue(casinoPage.getVirtualsHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextVirtualsHeaderElement(), exampleBundle.getString("virtuals_header"));
    }

    @Test(groups = {"CUR2"})
    public void financialsEnabledTest() {
        assertTrue(casinoPage.getFinancialsHeaderElement().isDisplayed());
        assertTrue(casinoPage.getFinancialsHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextFinancialsHeaderElement(), exampleBundle.getString("financials_header"));
    }

    @Test(groups = {"CUR2"})
    public void liveGamesEnabledTest() {
        assertTrue(casinoPage.getLiveGamesHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLiveGamesHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLiveGamesHeaderElement(), exampleBundle.getString("live_games_header"));
    }


    @Test(groups = {"CUR2"})
    public void marathonbetIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getMarathonbetIconHeaderElement().isDisplayed());
        assertTrue(casinoPage.getMarathonbetIconHeaderElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void servicesDropDownEnabledTest() {
        assertTrue(casinoPage.getServicesDropdownHeaderElement().isDisplayed());
        assertTrue(casinoPage.getServicesDropdownHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextServicesDropdownHeaderElement(), exampleBundle.getString("services_header"));
    }

    @Test(groups = {"CUR2"})
    public void resultsDropDownEnabledTest() {
        assertTrue(casinoPage.getResultsDropdownHeaderElement().isDisplayed());
        assertTrue(casinoPage.getResultsDropdownHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextResultsTextDropdownHeaderElement(), exampleBundle.getString("results_header"));
    }

    @Test(groups = {"CUR2"})
    public void languageDropDownEnabledTest() {
        assertTrue(casinoPage.getLanguageDropdownHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLanguageDropdownHeaderElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void settingsDropDownEnabledTest() {
        assertTrue(casinoPage.getSettingsDropdownHeaderElement().isDisplayed());
        assertTrue(casinoPage.getSettingsDropdownHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextSettingsDropdownHeaderElement(), exampleBundle.getString("settings_header"));
    }

    @Test(groups = {"CUR2"})
    public void chatEnabledTest() {
        assertTrue(casinoPage.getChatHeaderElement().isDisplayed());
        assertTrue(casinoPage.getChatHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextChatHeaderElement(), exampleBundle.getString("chat_header"));
    }

    @Test(groups = {"CUR2"})
    public void appsEnabledTest() {
        assertTrue(casinoPage.getAppsHeaderElement().isDisplayed());
        assertTrue(casinoPage.getAppsHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextAppsHeaderTextElement(), exampleBundle.getString("apps_header"));
    }

    @Test(groups = {"CUR2"})
    public void timeZoneEnabledTest() {
        assertTrue(casinoPage.getTimeZoneDropdownHeaderElement().isDisplayed());
        assertTrue(casinoPage.getTimeZoneDropdownHeaderElement().isEnabled());
    }
}




