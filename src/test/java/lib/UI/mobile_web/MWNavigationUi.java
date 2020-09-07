package lib.UI.mobile_web;

import lib.UI.NavigationUi;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWNavigationUi extends NavigationUi {

    static {
        MY_LISTS_LINK = "css:a[data-event-name='menu.unStar']";
        OPEN_NAVIGATION = "css:#mw-mf-main-menu-button";
        LOGIN_LINK = "css:a[data-event-name='menu.login']";
    }

    public MWNavigationUi(RemoteWebDriver driver)
    {
        super(driver);
    }
}
