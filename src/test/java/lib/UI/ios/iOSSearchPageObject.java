package lib.UI.ios;

import lib.UI.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSSearchPageObject extends SearchPageObject {

    static {
        SEARCH_INIT_ELEMENT = "id:Search Wikipedia";
        SEARCH_INPUT = "xpath://XCUIElementTypeSearchField";
        SEARCH_CANCEL_BUTTON = "id:Close";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://XCUIElementTypeStaticText[contains(@name, '{SUBSTRING}')]";
        SEARCH_RESULT_ELEMENT = "xpath://XCUIElementTypeCell";
        SEARCH_EMPTY_RESULT_ELEMENT = "id:No results found";
    }

    public iOSSearchPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
