package pages.objects;

import common.*;
import org.openqa.selenium.*;

public class BasePageObject extends TestBase {
    private String name;
    private String locator;
    private String value;

    public BasePageObject(String name, String locator, String value) {
        this.name = name;
        this.locator = locator;
        this.value = value;
    }
    public BasePageObject(String name, String locator) {
        this.name = name;
        this.locator = locator;
    }

    public String getName() {
        return name;
    }

    public String getLocator() {
        return locator;
    }

    public String getValue() {
        return value;
    }

    public void clearField() {
        getWebElement(getLocator()).clear();
    }


    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
    public JavascriptExecutor getJavascriptExecutor() {
        return this.javascriptExecutor;
    }
    public void scrollElementIntoView() {
        WebElement button = getWebElement(getLocator());
        if (!button.isDisplayed()) {
            getJavascriptExecutor().executeScript("arguments[0].scrollIntoView(true);", button);
        }
    }
}
