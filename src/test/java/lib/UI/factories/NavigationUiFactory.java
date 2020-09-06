package lib.UI.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.UI.NavigationUi;
import lib.UI.android.AndroidNavigationUi;
import lib.UI.ios.iOSArticlePageObject;
import lib.UI.ios.iOSNavigationUi;
import lib.UI.mobile_web.MWArticlePageObject;
import lib.UI.mobile_web.MWNavigationUi;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigationUiFactory {

    public static NavigationUi get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidNavigationUi(driver);
        } else if (Platform.getInstance().isIos()){
            return new iOSNavigationUi(driver);
        } else {
            return new MWNavigationUi(driver);
        }
    }
}
