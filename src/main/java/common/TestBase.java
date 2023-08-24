package common;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.io.*;
import java.util.concurrent.*;

public class TestBase {
    private ConfigFileReader configFileReader = new ConfigFileReader();
    private final String url = configFileReader.getUrl();
    public static WebDriver driver;

    public ConfigFileReader getConfig() {
        return this.configFileReader;
    }
    public void openUrl() {
        getDriver().get(url);
    }

    public WebDriver getDriver() {
        if (this.driver == null) {
            System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return this.driver;
    }

    /*public WebDriver getDriver() {
        if (this.driver == null) {
            System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--load-extension=C:/resources/extensions/uBlock-Origin");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        }
        return this.driver;
    }*/

    public void closeDriver() {
        getDriver().close();
        getDriver().quit();
    }

    public WebElement getWebElement(String locator) {
        if (locator.startsWith("id=")) {
            String idLocator = locator.substring(3);
            return getDriver().findElement(By.id(idLocator));
        } else if (locator.startsWith("name=")) {
            String nameLocator = locator.substring(5);
            return getDriver().findElement(By.name(nameLocator));
        } else if (locator.startsWith("xpath=")) {
            String xpathLocator = locator.substring(6);
            return getDriver().findElement(By.xpath(xpathLocator));
        } else if (locator.startsWith("css=")) {
            String cssLocator = locator.substring(4);
            return getDriver().findElement(By.cssSelector(cssLocator));}
        else if (locator.startsWith("class=")) {
            String classLocator = locator.substring(6);
            return getDriver().findElement(By.className(classLocator));
        }
        else return null;
    }
}
