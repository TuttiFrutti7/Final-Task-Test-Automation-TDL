package pages.objects;

import org.openqa.selenium.*;

public class Link extends BasePageObject
{
    public Link(String name, String locator) {
        super(name, locator);
    }

    public void click() {
        WebElement link = getWebElement(getLocator());
        link.click();
    }
    public boolean isLinkPresent() {
        WebElement link = getWebElement(getLocator());
        return link.isDisplayed();
    }
}
