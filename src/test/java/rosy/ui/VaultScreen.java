package rosy.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VaultScreen {
    public static Target VAULT_SCREEN_TITLE = Target.the("Vault screen")
            .located(By.xpath("//*[@text=\"All\"]"));// KHONG DUNG
    public static Target TAP_RESET_BUTTON = Target.the("Tap for new items")
            .located(By.xpath("//*[@text=\"Tap for new items\"]"));

    public static Target SEARCH_BUTTON = Target.the("Search button")
            .located(By.xpath("//*[@text=\"Search\"]/.."));

    public static Target INPUT_SEARCH_BOX = Target.the("Input keyword box")
            .located(By.xpath("//*[@content-desc=\"SearchPanelRenderPrimaryInputTouchable\"]"));

    public static Target SEARCH_INPUT = Target.the("Search Vault input")
            .located(By.xpath("//*[@content-desc=\"SearchPanelSearchInput\"]"));

    public static Target SEARCH_AFTER_INPUT = Target.the("Search")
            .located(By.xpath("//*[@content-desc=\"searchPanel_search\"]"));

    public static Target SEARCH_RESULT_SUMMARY = Target.the("Search result summary")
            .located(By.xpath("//*[@content-desc=\"SearchPillAnimatedSearchButton\"]/../android.widget.TextView"));

    public static Target CLEAR_SEARCH_BUTTON = Target.the("Clear search button")
            .located(By.xpath("//*[@text=\"Clear search\"]/.."));

  //  public static Target FILTER_BUTTON = Target.the("Filter button")
    //        .located(By.xpath("//*[@text=\"Filter\"]/.."));

    public static Target APPLY_FILTER_BUTTON = Target.the("Apply filter button")
            .located(By.xpath("//*[@text=\"Apply filters\"]/.."));

    public static Target LIST_OF_VAULT = Target.the("List of vault")
            .located(By.xpath("//*[@content-desc=\"vault-items\"]"));

    public static Target SEARCH = Target.the("Search Vault")
            .located(By.xpath("//*[@text='What can I help you find?']"));

    public static Target INPUT_SEARCH = Target.the("Enter keywork")
            .located(By.xpath("//android.widget.EditText"));
    //android.widget.EditText

    public static Target OPEN_SEARCH = Target.the("Open search")
            .located(By.xpath("//*[@text='Search Vault']"));

    public static Target VAULT_ITEMS = Target.the("Vault items")
            .located(By.xpath("//*[@content-desc=\"vault-items\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));

    public static Target BUTTON_PHOTOS = Target.the("Filter with Photos")
            .located(By.xpath("//*[@text='Photos']"));

    public static Target  BUTTON_DOCUMENTS=Target.the("Filter with Documents")
            .located(By.xpath("//*[@text='Documents']"));

    public static Target BEFORE_SEARCH_ITEMS = Target.the("Before Search Vault")
            .located(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));

    public static Target CANCEL_SEARCH= Target.the("Cancel search")
            .located(By.xpath("//*[@text='Cancel']"));


}
