package pages;

import com.codeborne.selenide.Condition;
import locators.LandingPageLocators;
import utils.PropertiesReader;

import static com.codeborne.selenide.Selenide.*;

/**
 * Class Landing page.
 */
public class LandingPage extends LandingPageLocators {
    /**
     * Navigate to main page landing page.
     *
     * @return the landing page
     */
    public LandingPage navigateToMainPage() {
        open(PropertiesReader.getProperty("URL"));
        return this;
    }

    /**
     * Method openAmountDropDown.
     *
     * @return the landing page
     */
    public LandingPage openAmountDropDown() {
        $(AMOUNT_DROP_DOWN).click();
        return this;
    }

    /**
     * Method openCategoryDropDown.
     *
     * @return the landing page
     */
    public LandingPage openCategoryDropDown() {
        $(CATEGORY_DROP_DOWN).click();
        return this;
    }

    /**
     * Method selectValue.
     *
     * @param value the value
     * @return the landing page
     */
    public LandingPage selectValue(final String value) {
        $$(SELECT_MENU_OUTER).find(Condition.text(value)).click();
        return this;
    }

    /**
     * Method selectAmount.
     *
     * @param value the value
     * @return the landing page
     */
    public LandingPage selectAmount(final String value) {
        openAmountDropDown();
        selectValue(value);
        return this;
    }

    /**
     * Method select Kaufpreis.
     *
     * @param value value.
     * @return the landing page
     */
    public LandingPage selectKaufpreis(final String value) {

        $(VEHICLE_PRICE).setValue(value);

        return this;
    }

    /**
     * Method select Anzahlung.
     *
     * @param value value.
     * @return the landing page
     */
    public LandingPage selectAnzahlung(final String value) {

        $(INITIAL_PAYMENT).setValue(value);

        return this;
    }

    /**
     * Method selectLaufzeitCategory.
     *
     * @param value value.
     * @return the landing page
     */
    public LandingPage selectLaufzeitCategory(final String value) {
        openCategoryDropDown();
        selectValue(value);
        return this;
    }

    /**
     * Method clickOnKreditvergleichStarten.
     *
     * @return the loan page
     */
    public LoanPage clickOnKreditvergleichStarten() {
        $(KREDIT_STARTEN_BUTTON).click();
        $(CONTACT_INFO_FORM).shouldBe(Condition.visible);
        return new LoanPage();
    }
}
