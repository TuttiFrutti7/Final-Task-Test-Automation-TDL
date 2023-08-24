package pages;

import pages.objects.*;
import common.TestBase;

public class HomePage {
    public Button dialogBox = new Button("DialogBox", "xpath=//a[contains(text(), 'DialogBox')]");
    public Link dialogLink = new Link("DialogBox","xpath=//a[text()='DialogBox']");

    public Link tabs = new Link("Tabs", "xpath=//a[text()='Tabs']");
    public Button progressBar = new Button("ProgressBar", "xpath=//a[text()='ProgressBar']");

    public boolean isInitialized() {
        return dialogLink.isLinkPresent();
    }
    public void clickOnDialogBox() {
        this.dialogBox.click();
    }
    public void clickOnTabs() {
        this.tabs.scrollElementIntoView();
        this.tabs.click();
    }
    public void clickOnPorgressBar() {
        this.progressBar.click();
    }
}
