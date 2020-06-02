package rosy.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeScreen {
    public static final Target SHOW_NAVIGATION = Target.the("Show navigation button")
            .located(By.xpath("//*[@content-desc='openDrawerMenuButton']"));


    public static final Target HIDE_NAVIGATION = Target.the("Hide navigation button")
            .located(By.xpath("//*[@content-desc='closeDrawerMenuButton']"));

    public static final Target LARGE_NAVIGATION = Target.the("The Navigation bar")
            .located(By.xpath("//*[@content-desc='drawerMenu']"));

    public static final Target LOGOUT_BUTTON = Target.the("Logout button")
            .located(By.xpath("//*[@content-desc=\"logout\"]"));

    public static final Target ITEM_LIST = Target.the("Item list")
            .located(By.xpath("//android.widget.HorizontalScrollView"));

    public static Target LOCATION_PERMISSION = Target.the("Location request permission")
            .located(By.id("com.android.packageinstaller:id/dialog_container"));
    public static Target DENY = Target.the("Deny button")
            .located(By.id("com.android.packageinstaller:id/permission_deny_button"));
    public static Target ALLOW = Target.the("Allow button")
            .located(By.id("com.android.packageinstaller:id/permission_allow_button"));


    public static Target OK = Target.the("Ok button")
            .located(By.id("android:id/button2"));
    public static Target CANCEL = Target.the("Cancel button")
            .located(By.id("android:id/button1"));

    public static Target DETECTED_LOCATION = Target.the("Detected Location")
            .located(By.xpath("//*[@content-desc=\"weatherDescription_label\"]/android.widget.TextView[2]"));

    public static Target VAULT_NAVIGATION_BUTTON = Target.the("Vault button on navigation")
            .located(By.xpath("//*[@content-desc='vaultBottomTab']"));
    //(//android.view.ViewGroup[@index='1'])[10]
    public static Target ADD_VAULT_BUTTON = Target.the("Add Vault button")
            .located(By.xpath("//*[@content-desc='galleryBottomTab']"));

    public static Target HOME_BUTTON = Target.the("Home button")
            .located(By.xpath("//*[@content-desc='homeBottomTab']"));
    //(//android.view.ViewGroup[@index='1'])[15]
    public static Target UPLOADING = Target.the("Uploading vault")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"VaultScreen\"]/android.view.ViewGroup[1]\n"));

    public static Target Size= Target.the("size")
            .located(By.xpath("//*[@resource-id='com.demorosyv2:id/action_bar_root']"));
  //  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout

    public static Target FEEDBACK= Target.the("Feedback")
            .located(By.xpath("//*[@text='Feedback']"));




    // //*[@text='Documents']
    //


}
