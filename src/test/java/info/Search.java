package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.*;


public class Search {

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


    @Test(groups = {"CUR2"},priority = 2)
    public void searchFieldEnabledTest() throws Exception {
        assertTrue(casinoPage.getSearchFieldElement().isDisplayed());
        assertTrue(casinoPage.getSearchFieldElement().isEnabled());
        assertEquals(casinoPage.getTextSearchFieldElement(), exampleBundle.getString("search_field_header"));
    }

    @Test(groups = {"CUR2"})
    public void searchIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getSearchIconSearchFieldElement().isDisplayed());
        assertTrue(casinoPage.getSearchIconSearchFieldElement().isEnabled());
    }



    @Test(groups = {"CUR2"})
    public void crossEnabledTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_one_letter"));
        assertTrue(casinoPage.getCrossIconSearchFieldElement().isDisplayed());
        assertTrue(casinoPage.getCrossIconSearchFieldElement().isEnabled());
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"})
    public void crossPressTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_one_letter"));
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossIconSearchFieldElement());
        assertEquals(casinoPage.getTextSearchFieldElement(), exampleBundle.getString("search_field_header"));
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void oneSymbolsHeaderMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_one_letter"));
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("request_too_short_header"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void oneSymbolsBodyMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_one_letter"));
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("request_too_short_body"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void twoSymbolsHeaderMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_two_letters"));
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("request_too_short_header"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void twoSymbolsBodyMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_two_letters"));
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("request_too_short_body"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsSearchHeaderMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_three_letters"));
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("no_results_header"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsSearchBodyMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_three_letters"));
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("no_results_body"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsSymbolsSearchHeaderMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_special_symbols"));
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("no_results_header"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsSymbolsSearchBodyMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_special_symbols"));
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("no_results_body"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsRussianLanguageSearchHeaderMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_russian_letters"));
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("no_results_header"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsRussianLanguageSearchBodyMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_russian_letters"));
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("no_results_body"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsDiffCasesSearchHeaderMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_incorrect_different_cases"));
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("no_results_header"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsDiffCasesSearchBodyMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_incorrect_different_cases"));
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("no_results_body"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsNumbersSearchHeaderMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_numbers"));
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("no_results_header"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResultsNumbersSearchBodyMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_numbers"));
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("no_results_body"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResults23symbolsSearchHeaderMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_23_symbols"));
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("no_results_header"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void noResults23symbolsSearchBodyMessageTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_23_symbols"));
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("no_results_body"));
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void betGamesTvSearchTest() throws Exception {
        casinoPage.search(exampleBundle.getString("bet_games_tv_game"));
        casinoPage.waitIfElementIsClickableFluent(casinoPage.getBetGamesTvSearchResultGameElement());
        assertTrue(casinoPage.getBetGamesTvSearchResultGameElement().isDisplayed());
        casinoPage.clearSearchField();
    }

    @Test(groups = {"CUR2"},priority = 2)
    public void differentCasesSearchTest() throws Exception {
        casinoPage.search(exampleBundle.getString("search_bet_games_tv_game_different_cases"));
        casinoPage.waitIfElementIsClickableFluent(casinoPage.getBetGamesTvSearchResultGameElement());
        assertTrue(casinoPage.getBetGamesTvSearchResultGameElement().isDisplayed());
        casinoPage.clearSearchField();
    }


}