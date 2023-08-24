package pages;

import pages.objects.*;

public class DialogBoxes {
    public Button createNewUserButton = new Button("Create new user", "xpath=//*[@id=\"create-user\"]");
    public Link sortable = new Link("Sortable", "xpath=//*[@id=\"menu-item-2806\"]/a");

    public boolean isInitialized() {
        return sortable.isLinkPresent();
    }
    public void clickOnCreateNewUser() {
        this.createNewUserButton.click();
    }

}
