package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BetGamesTvGame;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class BetGamesTvDemo {


    BetGamesTvGame betGamesTvGame;
    String oldBalanceInHeader;
    String bet;
    String oldBalanceInGame;


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        betGamesTvGame = new BetGamesTvGame();
        betGamesTvGame.search(exampleBundle.getString("bet_games_tv_game"));
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        betGamesTvGame.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = {"CUR2"})
    public void loginPopupBetGamesTvDemoTest() throws Exception {
        betGamesTvGame.clickElement(betGamesTvGame.getBetGamesTvSearchResultGameElement());
        assertTrue(betGamesTvGame.isElementClickable(betGamesTvGame.getLoginPopupElement()));
    }
}

