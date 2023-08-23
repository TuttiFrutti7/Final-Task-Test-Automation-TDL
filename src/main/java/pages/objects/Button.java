package pages.objects;

import org.openqa.selenium.*;

public class Button extends BasePageObject
{

    public Button(String name, String locator) {
        super(name, locator);
    }

    public void click() {
        WebElement button = getWebElement(getLocator());
        button.click();
    }
}
