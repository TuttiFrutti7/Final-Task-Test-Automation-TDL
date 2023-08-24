package pages;

import pages.objects.*;
import common.TestBase;

public class HomePage {
    public Button dialogBox = new Button("DialogBox", "css=#post-2715 > div:nth-child(3) > div > div > div.row.price_table_holder.col_4 > div:nth-child(1) > ul > li:nth-child(6) > a");
    public Link dialogLink = new Link("DialogBox","css=#post-2715 > div:nth-child(3) > div > div > div.row.price_table_holder.col_4 > div:nth-child(1) > ul > li:nth-child(6) > a");

    public Link tabs = new Link("Tabs", "css=#post-2715 > div:nth-child(3) > div > div > div.row.price_table_holder.col_4 > div:nth-child(1) > ul > li:nth-child(2) > a");
    public Button progressBar = new Button("ProgressBar", "css=#post-2715 > div:nth-child(3) > div > div > div.row.price_table_holder.col_4 > div:nth-child(1) > ul > li:nth-child(7) > a");

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
