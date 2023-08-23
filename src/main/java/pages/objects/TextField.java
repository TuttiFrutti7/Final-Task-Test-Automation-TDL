package pages.objects;

import org.openqa.selenium.*;

public class TextField extends BasePageObject
{
    public TextField(String name, String locator, String value) {
        super(name, locator, value);
    }

    public void setValue() {
        WebElement textField = getWebElement(getLocator());
        textField.sendKeys(getValue());
    }
}
