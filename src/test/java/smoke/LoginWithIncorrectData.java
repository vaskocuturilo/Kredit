package smoke;

import driver.BaseTest;
import org.testng.annotations.Test;
import pages.LandingPage;
import ru.yandex.qatools.allure.annotations.Title;

public class LoginWithIncorrectData extends BaseTest {
    @Title("Navigate to Auto(Credit) tab > Login with incorrect data")
    @Test
    public void loginAndLogOut() {
        new LandingPage()
                .navigateToMainPage()
                .selectAmount("Auto / Motorrad")
                .selectKaufpreis("11000")
                .selectAnzahlung("2000")
                .selectLaufzeitCategory("24 Monate")
                .clickOnKreditvergleichStarten()
                .checkThatPageIsCompletelyLoaded()
                .clickOnNavigateToPersonButton()
                .clickOnSubmitLoginFormButton()
                .enterEmail("test.com")
                .enterPassword("blablabla")
                .clickOnAnmeldenLoginForm()
                .checkThatErrorMessageIsPresent();
    }
}
