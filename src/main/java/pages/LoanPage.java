package pages;

import com.codeborne.selenide.Condition;
import locators.LoanPageLocators;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static org.testng.Assert.assertEquals;

/**
 * Class Loanpage.
 */
public class LoanPage extends LoanPageLocators {
    /**
     * Method clickOnNavigateToPersonButton.
     *
     * @return the loan page
     */
    public LoanPage clickOnNavigateToPersonButton() {
        $(NAVIGATE_TO_PERSON_BUTTON).click();
        return this;
    }

    /**
     * Method clickOnAnmeldenLoginForm.
     *
     * @return the loan page
     */
    public LoanPage clickOnAnmeldenLoginForm() {
        $(LOGIN_FORM_LINK_BUTTON).click();
        return this;
    }

    /**
     * Method clickOnSubmitLoginFormButton.
     *
     * @return the loan page
     */
    public LoanPage clickOnSubmitLoginFormButton() {
        $(LOGIN_FORM_SUBMIT_BUTTON).click();
        return this;
    }

    /**
     * Method checkThatPageIsCompletelyLoaded.
     *
     * @return the loan page
     */
    public LoanPage checkThatPageIsCompletelyLoaded() {
        assertEquals("complete", executeJavaScript("return document.readyState"));
        return this;
    }

    /**
     * Method checkThatErrorMessageIsPresent.
     *
     * @return the loan page
     */
    public LoanPage checkThatErrorMessageIsPresent() {
        $(ERROR_MESSAGE_OF_LOGIN_FIELD).shouldBe(Condition.visible);
        return this;
    }

    /**
     * Method enterEmail.
     *
     * @param value the value
     * @return the loan page
     */
    public LoanPage enterEmail(final String value) {
        $(EMAIL_FIELD).setValue(value);
        return this;
    }

    /**
     * Method enterPassword.
     *
     * @param value the value
     * @return the loan page
     */
    public LoanPage enterPassword(final String value) {
        $(PASSWORD_FIELD).setValue(value);
        return this;
    }
}
