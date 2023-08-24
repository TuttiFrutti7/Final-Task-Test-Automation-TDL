package pages;

import pages.objects.*;

public class AutoComplete {
    public Link logo = new Link("GlobalSQA","css=a img");
    //public TextField searchField = new TextField("search","css=body input#search","and");
    public TextField searchField = new TextField("search","css=input#search","and");
    public Button anderson = new Button("anders andersson","css=div#ui-id-63");

    public boolean isInitialized() {
        return logo.isLinkPresent();
    }
    public void search() {
        this.searchField.setValue();
        this.anderson.click();
    }
}
