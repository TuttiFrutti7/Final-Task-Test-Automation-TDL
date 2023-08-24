package pages;

import pages.objects.*;

public class ProgressBar {
    public Button randomProgressBar = new Button("Random Progress Bar", "xpath=//li[text()='Random Progress Bar']");

    public void clickOnRandomProgressBar() {
        this.randomProgressBar.click();
    }
}
