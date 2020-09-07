package lib.UI.ios;

import lib.UI.NavigationUi;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSNavigationUi extends NavigationUi {

    static {
        MY_LISTS_LINK = "id:Saved";
    }

    public iOSNavigationUi(RemoteWebDriver driver)
    {
        super(driver);
    }
}
