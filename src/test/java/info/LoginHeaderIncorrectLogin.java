package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;


public class LoginHeaderIncorrectLogin {

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
    public void incorectLoginTest() throws Exception {
        casinoPage.login(exampleBundle.getString("incorrect_login"), exampleBundle.getString("correct_password"));
        casinoPage.closeIncorectLoginMessage();
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());

    }

    @Test(groups = {"CUR2"})
    public void incorectPasswordTest() throws Exception {
        casinoPage.login(exampleBundle.getString("correct_login"), exampleBundle.getString("incorrect_password"));
        casinoPage.closeIncorectLoginMessage();
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test(groups = {"CUR2"})
    public void incorectLoginAndPasswordTest() throws Exception {
        casinoPage.login(exampleBundle.getString("incorrect_login"), exampleBundle.getString("incorrect_password"));
        casinoPage.closeIncorectLoginMessage();
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test(groups = {"CUR2"})
    public void blankLoginAndPasswordTest() throws Exception {
        casinoPage.login("", "");
        casinoPage.closeIncorectLoginMessage();
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test(groups = {"CUR2"})
    public void blankLoginTest() throws Exception {
        casinoPage.login("", exampleBundle.getString("correct_password"));
        casinoPage.closeIncorectLoginMessage();
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test(groups = {"CUR2"})
    public void blankPasswordTest() throws Exception {
        casinoPage.login(exampleBundle.getString("correct_login"), "");
        casinoPage.closeIncorectLoginMessage();
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }
}


