package lib.UI;

import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class NavigationUi extends MainPageObject{

    protected static String
            MY_LISTS_LINK,
            LOGIN_LINK,
            OPEN_NAVIGATION;

    public NavigationUi(RemoteWebDriver driver)
    {
        super(driver);
    }

    public void openNavigation(){
        if (Platform.getInstance().isMw()){
            this.waitForElementAndClick(OPEN_NAVIGATION, "Cannot find and click navigation button", 5);
        } else {
            System.out.println("Method openNavigation() do nothing for platform" + Platform.getInstance().getPlatformVar());
        }
    }

    public void clickMyLists()
    {
        if (Platform.getInstance().isMw()) {
            this.tryClickElementWithFewAttempts(
                    MY_LISTS_LINK,
                    "Cannot find navigation button to My List",
                    5
            );
        } else {
            this.waitForElementAndClick(
                    MY_LISTS_LINK,
                    "Cannot find navigation button to My list",
                    5
            );
        }

    }

    public void clickLogin()
    {
            this.tryClickElementWithFewAttempts(
                    LOGIN_LINK,
                    "Cannot find navigation button to Login",
                    5
            );
    }
}
