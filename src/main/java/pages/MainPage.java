package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {


    public MainPage() throws Exception {
        super();
    }


    @FindBy(xpath = "//div[@id='header_container']//a[@aria-label='Sport']")
    protected WebElement sportHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/home')]")
    protected WebElement sportHeaderElementES;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/live')]")
    protected WebElement liveHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/toto/gi')]")
    protected WebElement totoHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/casino/lobby')]")
    protected WebElement casinoHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/livecasino')]")
    protected WebElement liveCasinoHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/e-sport')]")
    protected WebElement eSportHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/betconstructor/footballconstructor.htm')]")
    protected WebElement constructorHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/virtual-sports')]")
    protected WebElement virtualsHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/finstakes.htm')]")
    protected WebElement financialsHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/live-games')]")
    protected WebElement liveGamesHeaderElement;



    @FindBy(xpath = "//li[@class='settings__item']/div/div")
    protected WebElement servicesDropdownHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/results.htm')]//ancestor::li")
    protected WebElement resultsDropdownHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/results.htm')]//ancestor::li/div/div")
    protected WebElement resultsTextDropdownHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//li[@id='language_form']")
    protected WebElement languageDropdownHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//div[@id='settingsDropdown']")
    protected WebElement settingsDropdownHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/livechatvisitor')]")
    protected WebElement chatHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/mobile.htm')]")
    protected WebElement appsHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@href,'/mobile.htm')]//div")
    protected WebElement appsHeaderTextElement;
    @FindBy(xpath = "//div[@id='header_container']//span[@id='timer']")
    protected WebElement timeZoneDropdownHeaderElement;


    @FindBy(xpath = "//div[@class='grid-footer']//span[contains(@data-show-help,'help')]")
    protected WebElement aboutUsFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//span[contains(@data-show-help,'privacy_policy')]")
    protected WebElement privacyPolicyFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//span[contains(@data-show-help,'responsible_gambling')]")
    protected WebElement responsibleGamingFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//span[contains(@data-show-help,'terms_and_conditions')]")
    protected WebElement termsAndConditionsFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//span[contains(@data-show-help,'contact_us')]")
    protected WebElement contactUsFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//span[contains(@data-show-help,'payments')]")
    protected WebElement paymentsFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//a[contains(@href,'mobile')]")
    protected WebElement mobileSiteFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//a[contains(@href,'blog')]")
    protected WebElement blogFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//a[contains(@href,'apuestas')]")
    protected WebElement blogFooterESElement;
    @FindBy(xpath = "//div[@class='grid-footer']//a[contains(@href,'partners.marathonbet.com/login.asp')]")
    protected WebElement affiliatesALDFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//a[contains(@href,'affiliates')]")
    protected WebElement affiliatesCURFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//a[contains(@href,'partners.htm')]")
    protected WebElement ourParntersFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//a[contains(@href,'partners.htm?partnerName')]")
    protected WebElement partnreshipHistoryFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//span[contains(@data-show-help,'help/general_rules')]")
    protected WebElement helpFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//span[contains(@data-show-help,'help/contact_us')]")
    protected WebElement helpFooterESElement;
    @FindBy(xpath = "//div[@class='grid-footer']//span[contains(@data-show-help,'help/cookies_policy')]")
    protected WebElement cookiesPolicyFooterElement;

    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-mancity']")
    protected WebElement manCityElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-sevilla']")
    protected WebElement sevillaElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-girona']")
    protected WebElement gironaElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-dinamo_moscow']")
    protected WebElement dinamoElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-karpaty']")
    protected WebElement karpatyElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-zaragoza']")
    protected WebElement zaragozaElement;


    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-visa']")
    protected WebElement visaIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-mastercard']")
    protected WebElement mastercardIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-maestro']")
    protected WebElement maestroIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-bank_transfer']")
    protected WebElement bankTransferIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-moneybookers']")
    protected WebElement skrillIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-neteller']")
    protected WebElement netellerIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-paysafecard']")
    protected WebElement paySafeCardIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-trustly']")
    protected WebElement trustlyIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-ecopayz']")
    protected WebElement ecoPayzIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-paypal']")
    protected WebElement payPalIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-teleingreso']")
    protected WebElement teleIngresoIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-bitcoin']")
    protected WebElement bitcoinIconElement;

    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-rgt-donor']")
    protected WebElement rgtDonorIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-social_facebook']")
    protected WebElement facebookIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-social_twitter']")
    protected WebElement twitterIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-age-restriction-18']")
    protected WebElement ageRestrictionIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//em[@class='sprite-curacao_gaming_licensing']")
    protected WebElement gamblingLicensingIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//a[contains(@href,'shutterstock.com')]")
    protected WebElement shutterstockLinkElement;



    public WebElement getSportHeaderElement() {
        return sportHeaderElement;
    }

    public WebElement getLiveHeaderElement() {
        return liveHeaderElement;
    }

    public WebElement getTotoHeaderElement() {
        return totoHeaderElement;
    }

    public WebElement getCasinoHeaderElement() {
        return casinoHeaderElement;
    }

    public WebElement getLiveCasinoHeaderElement() {
        return liveCasinoHeaderElement;
    }

    public WebElement getESportHeaderElement() {
        return eSportHeaderElement;
    }

    public WebElement getVirtualsHeaderElement() {
        return virtualsHeaderElement;
    }

    public WebElement getFinancialsHeaderElement() {
        return financialsHeaderElement;
    }


    public WebElement getConstructorHeaderElement() {
        return constructorHeaderElement;
    }


    public WebElement getLiveGamesHeaderElement() {
        return liveGamesHeaderElement;
    }


    public WebElement getServicesDropdownHeaderElement() {
        return servicesDropdownHeaderElement;
    }

    public WebElement getResultsDropdownHeaderElement() {
        return resultsDropdownHeaderElement;
    }

    public WebElement getResultsTextDropdownHeaderElement() {
        return resultsTextDropdownHeaderElement;
    }


    public WebElement getLanguageDropdownHeaderElement() {
        return languageDropdownHeaderElement;
    }

    public WebElement getSettingsDropdownHeaderElement() {
        return settingsDropdownHeaderElement;
    }

    public WebElement getChatHeaderElement() {
        return chatHeaderElement;
    }

    public WebElement getAppsHeaderElement() {
        return appsHeaderElement;
    }

    public WebElement getAppsHeaderTextElement() {
        return appsHeaderTextElement;
    }

    public WebElement getTimeZoneDropdownHeaderElement() {
        return timeZoneDropdownHeaderElement;
    }


    public WebElement getAboutUsFooterElement() {
        return aboutUsFooterElement;
    }

    public WebElement getPrivacyPolicyFooterElement() {
        return privacyPolicyFooterElement;
    }

    public WebElement getResponsibleGamingFooterElement() {
        return responsibleGamingFooterElement;
    }

    public WebElement getTermsAndConditionsFooterElement() {
        return termsAndConditionsFooterElement;
    }

    public WebElement getContactUsFooterElement() {
        return contactUsFooterElement;
    }

    public WebElement getPaymentsFooterElement() {
        return paymentsFooterElement;
    }

    public WebElement getMobileSiteFooterElement() {
        return mobileSiteFooterElement;
    }

    public WebElement getBlogFooterElement() {
        return blogFooterElement;
    }

    public WebElement getAffiliatesALDFooterElement() {
        return affiliatesALDFooterElement;
    }

    public WebElement getAffiliatesCURFooterElement() {
        return affiliatesCURFooterElement;
    }

    public WebElement getOurParntersFooterElement() {
        return ourParntersFooterElement;
    }

    public WebElement getPartnreshipHistoryFooterElement() {
        return partnreshipHistoryFooterElement;
    }

    public WebElement getHelpFooterElement() {
        return helpFooterElement;
    }

    public WebElement getCookiesPolicyFooterElement() {
        return cookiesPolicyFooterElement;
    }

    public WebElement getBlogFooterESElement() {
        return blogFooterESElement;
    }

    public WebElement getHelpFooterESElement() {
        return helpFooterESElement;
    }

    public WebElement getManCityElement() {
        return manCityElement;
    }

    public WebElement getSevillaElement() {
        return sevillaElement;
    }

    public WebElement getGironaElement() {
        return gironaElement;
    }

    public WebElement getDinamoElement() {
        return dinamoElement;
    }

    public WebElement getKarpatyElement() {
        return karpatyElement;
    }

    public WebElement getZaragozaElement() {
        return zaragozaElement;
    }

    public WebElement getVisaIconElement() {
        return visaIconElement;
    }

    public WebElement getMastercardIconElement() {
        return mastercardIconElement;
    }

    public WebElement getMaestroIconElement() {
        return maestroIconElement;
    }

    public WebElement getBankTransferIconElement() {
        return bankTransferIconElement;
    }

    public WebElement getSkrillIconElement() {
        return skrillIconElement;
    }

    public WebElement getNetellerIconElement() {
        return netellerIconElement;
    }

    public WebElement getPaySafeCardIconElement() {
        return paySafeCardIconElement;
    }

    public WebElement getTrustlyIconElement() {
        return trustlyIconElement;
    }

    public WebElement getEcoPayzIconElement() {
        return ecoPayzIconElement;
    }

    public WebElement getPayPalIconElement() {
        return payPalIconElement;
    }

    public WebElement getTeleIngresoIconElement() {
        return teleIngresoIconElement;
    }

    public WebElement getBitcoinIconElement() {
        return bitcoinIconElement;
    }

    public WebElement getRgtDonorIconElement() {
        return rgtDonorIconElement;
    }



    public WebElement getFacebookIconElement() {
        return facebookIconElement;
    }

    public WebElement getTwitterIconElement() {
        return twitterIconElement;
    }

    public WebElement getAgeRestrictionIconElement() {
        return ageRestrictionIconElement;
    }

    public WebElement getGamblingLicensingIconElement() {
        return gamblingLicensingIconElement;
    }



    public WebElement getShutterstockLinkElement() {
        return shutterstockLinkElement;
    }


    public String getTextSportHeaderElement() {
        return getSportHeaderElement().getText();
    }

    public String getTextLiveHeaderElement() {
        return getLiveHeaderElement().getText();
    }

    public String getTextTotoHeaderElement() {
        return getTotoHeaderElement().getText();
    }

    public String getTextCasinoHeaderElement() {
        return getCasinoHeaderElement().getText();
    }

    public String getTextLiveCasinoHeaderElement() {
        return getLiveCasinoHeaderElement().getText();
    }

    public String getTextESportHeaderElement() {
        return getESportHeaderElement().getText();
    }

    public String getTextVirtualsHeaderElement() {
        return getVirtualsHeaderElement().getText();
    }

    public String getTextFinancialsHeaderElement() {
        return getFinancialsHeaderElement().getText();
    }


    public String getTextConstructorHeaderElement() {
        return getConstructorHeaderElement().getText();
    }

    public String getTextLiveGamesHeaderElement() {
        return getLiveGamesHeaderElement().getText();
    }

    public String getTextServicesDropdownHeaderElement() {
        return getServicesDropdownHeaderElement().getText();
    }

    public String getTextResultsTextDropdownHeaderElement() {
        return resultsTextDropdownHeaderElement.getText();
    }
    public String getTextSettingsDropdownHeaderElement() {
        return getSettingsDropdownHeaderElement().getText();
    }

    public String getTextChatHeaderElement() {
        return getChatHeaderElement().getText();
    }

    public String getTextAppsHeaderTextElement() {
        return getAppsHeaderTextElement().getText();
    }

    public String getTextTimeZoneDropdownHeaderElement() {
        return getTimeZoneDropdownHeaderElement().getText();
    }

    public String getTextAboutUsFooterElement() {
        return getAboutUsFooterElement().getText();
    }

    public String getTextPrivacyPolicyFooterElement() {
        return getPrivacyPolicyFooterElement().getText();
    }

    public String getTextResponsibleGamingFooterElement() {
        return getResponsibleGamingFooterElement().getText();
    }

    public String getTextTermsAndConditionsFooterElement() {
        return getTermsAndConditionsFooterElement().getText();
    }

    public String getTextContactUsFooterElement() {
        return getContactUsFooterElement().getText();
    }

    public String getTextPaymentsFooterElement() {
        return getPaymentsFooterElement().getText();
    }

    public String getTextMobileSiteFooterElement() {
        return getMobileSiteFooterElement().getText();
    }

    public String getTextBlogFooterElement() {
        return getBlogFooterElement().getText();
    }

    public String getTextAffiliatesALDFooterElement() {
        return getAffiliatesALDFooterElement().getText();
    }

    public String getTextAffiliatesCURFooterElement() {
        return getAffiliatesCURFooterElement().getText();
    }

    public String getTextOurParntersFooterElement() {
        return getOurParntersFooterElement().getText();
    }

    public String getTextPartnreshipHistoryFooterElement() {
        return getPartnreshipHistoryFooterElement().getText();
    }

    public String getTextHelpFooterElement() {
        return getHelpFooterElement().getText();
    }

    public String getTextCookiesPolicyFooterElement() {
        return getCookiesPolicyFooterElement().getText();
    }

    public String getTextBlogFooterESElement() {
        return getBlogFooterESElement().getText();
    }

    public String getTextHelpFooterESElement() {
        return getHelpFooterESElement().getText();
    }


}





