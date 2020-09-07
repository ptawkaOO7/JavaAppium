package lib.UI;

import org.openqa.selenium.remote.RemoteWebDriver;

public class AuthorizationPageObject extends MainPageObject{
    private static final String
    LOGIN_BUTTON = "xpath://a[text()='Log in']",
    LOGIN_INPUT = "css:input#wpName1",
    PASSWORD_INPUT = "css:input#wpPassword1",
    SUBMIT_BUTTON = "css:button#wpLoginAttempt";

    public AuthorizationPageObject(RemoteWebDriver driver){
        super(driver);
    }

    public void clickAuthButton()
    {
        this.waitForElementPresent(LOGIN_BUTTON, "Cannot find auth button", 15);
        this.waitForElementAndClick(LOGIN_BUTTON, "Cannot find and click auth button", 5);
    }

    public void enterLoginData(String login, String password)
    {
        this.waitForElementAndClick(LOGIN_INPUT, "Cannot find login", 5);
        this.waitForElementAndSendKeys(LOGIN_INPUT, login, "Cannot find and put a login to the login input", 5);
        this.waitForElementAndSendKeys(PASSWORD_INPUT, password, "Cannot find and put a password to the password input", 5);
    }

    public void submitForm()
    {
        this.waitForElementAndClick(SUBMIT_BUTTON, "Cannot find and click submit auth button", 5);
    }
}
