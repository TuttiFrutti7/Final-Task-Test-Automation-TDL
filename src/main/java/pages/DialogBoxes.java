package pages;

import pages.objects.*;

public class DialogBoxes {
    public Button createNewUserButton = new Button("Create new user", "css=button#create-user");
    public Link sortable = new Link("Sortable", "css=#menu-item-2806 > a > span.link_span");
    public Button messageBox = new Button("Message Box", "css=#Message\\ Box");
    public Button ok = new Button("Ok", "css=body > div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.ui-dialog-buttons.ui-draggable.ui-resizable > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div > button");

    public boolean isInitialized() {
        return sortable.isLinkPresent();
    }
    public void clickOnCreateNewUser() {
        this.createNewUserButton.click();
    }
    public void clickOnMessageBox() {
        this.messageBox.click();
    }
    public void clickOnOk() {
        this.ok.click();
    }

}
