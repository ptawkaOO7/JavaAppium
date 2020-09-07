package lib.UI.factories;

import lib.Platform;
import lib.UI.MyListsPageObject;
import lib.UI.android.AndroidMyListsPageObject;
import lib.UI.ios.iOSMyListsPageObject;
import lib.UI.mobile_web.MWMyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyListsPageObjectFactory {

    public static MyListsPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidMyListsPageObject(driver);
        } else if (Platform.getInstance().isIos()){
            return new iOSMyListsPageObject(driver);
        } else {
            return new MWMyListsPageObject(driver);
        }
    }
}
