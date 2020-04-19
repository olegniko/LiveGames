package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BetGamesTvGame extends CasinoPage {

    public BetGamesTvGame() throws Exception {
        super();
    }
    @FindBy(xpath = "//li[@data-qa='amount-selector-button-1']")
    protected WebElement betInEuroSpeedy7;
    @FindBy(xpath = "//li[@data-qa='amount-selector-button-3']")
    protected WebElement betIn3EuroSpeedy7;
    @FindBy(xpath = "//li[@data-qa='amount-selector-button-5']")
    protected WebElement betIn5EuroSpeedy7;
    @FindBy(xpath = "//li[@data-qa='amount-selector-button-10']")
    protected WebElement betIn10EuroSpeedy7;

    @FindBy(xpath = "//span[@data-qa='betting-option-red-value']//parent::button")
    protected WebElement chooseRedSpeedy7;
    @FindBy(xpath = "//span[@data-qa='possible-win-red']")
    protected WebElement possibleWinRedSpeedy7;
    @FindBy(xpath = "//span[@data-qa='betting-option-black-value']//parent::button")
    protected WebElement chooseBlackSpeedy7;
    @FindBy(xpath = "//span[@data-qa='possible-win-black']")
    protected WebElement possibleWinBlackSpeedy7;

    @FindBy(xpath = "//div[@data-qa='button-cashout']")
    protected WebElement betButtonSpeedy7;
    @FindBy(xpath = "//div[@data-qa='button-cashout']/span[2]")
    protected WebElement betButtonTextSpeedy7;
    @FindBy(xpath = "//div[@data-qa='button-cashout']//span[normalize-space(text()) = 'Stake amount']/following-sibling::span")
    protected WebElement stakeAmountSpeedy7;
    @FindBy(xpath = "//div[@data-qa='button-cashout']//span[normalize-space(text()) = 'Cash Out']/following-sibling::span")
    protected WebElement totalCashoutSpeedy7;

    @FindBy(xpath = "//span[@class='sp7-initial-stake']/span[2]")
    protected WebElement stakeAmountMessageSpeedy7;

    @FindBy(xpath = "//div[@data-qa='area-center-messages']//span[normalize-space(text()) ='Select stake to play']")
    protected WebElement selectStakeMessageSpeedy7;
    @FindBy(xpath = "//div[@data-qa='area-center-messages']//span[normalize-space(text()) = 'Make a choice']")
    protected WebElement makeChoiseMessageSpeedy7;
    @FindBy(xpath = "//div[@data-qa='area-center-messages']//span[normalize-space(text()) = 'Bet accepted. Good luck!']")
    protected WebElement betAcceptedMessageSpeedy7;
    @FindBy(xpath = "//div[@data-qa='area-center-messages']//span[normalize-space(text()) ='Try again. Better luck next time!']")
    protected WebElement loseMessageMessageSpeedy7;
    @FindBy(xpath = "//div[@data-qa='area-center-messages']//span[normalize-space(text()) = 'Congratulations! Great Win!']")
    protected WebElement winMessageSpeedy7;


    public WebElement getBetInEuroSpeedy7() { return betInEuroSpeedy7; }
    public WebElement getBetIn3EuroSpeedy7() { return betIn3EuroSpeedy7; }
    public WebElement getBetIn5EuroSpeedy7() { return betIn5EuroSpeedy7; }
    public WebElement getBetIn10EuroSpeedy7() { return betIn10EuroSpeedy7; }

    public WebElement getPossibleWinRedSpeedy7() { return possibleWinRedSpeedy7; }
    public WebElement getPossibleWinBlackSpeedy7() { return possibleWinBlackSpeedy7; }
    public WebElement getChooseBlackSpeedy7() { return chooseBlackSpeedy7; }
    public WebElement getChooseRedSpeedy7() { return chooseRedSpeedy7; }

    public WebElement getBetButtonSpeedy7() { return betButtonSpeedy7; }
    public WebElement getTotalCashoutSpeedy7() { return totalCashoutSpeedy7; }
    public WebElement getStakeAmountSpeedy7() { return stakeAmountSpeedy7;}
    public WebElement getBetButtonTextSpeedy7() { return betButtonTextSpeedy7; }

    public WebElement getStakeAmountMessageSpeedy7() { return stakeAmountMessageSpeedy7; }

    public WebElement getSelectStakeMessageSpeedy7() { return selectStakeMessageSpeedy7; }
    public WebElement getWinMessageSpeedy7() { return winMessageSpeedy7; }
    public WebElement getMakeChoiseMessageSpeedy7() { return makeChoiseMessageSpeedy7; }
    public WebElement getBetAcceptedMessageSpeedy7() { return betAcceptedMessageSpeedy7; }
    public WebElement getLoseMessageMessageSpeedy7() { return loseMessageMessageSpeedy7; }

    public String getTextBetButtonTextSpeedy7() { return betButtonTextSpeedy7.getText(); }
    public String getTextStakeAmountSpeedy7() { return stakeAmountSpeedy7.getText(); }
    public String getTextTotalCashoutSpeedy7() { return totalCashoutSpeedy7.getText(); }
    public String getTextPossibleWinRedSpeedy7() { return possibleWinRedSpeedy7.getText(); }
    public String getTextPossibleWinBlackSpeedy7() { return possibleWinBlackSpeedy7.getText(); }
    public String getTextStakeAmountMessageSpeedy7() { return stakeAmountMessageSpeedy7.getText(); }
}

