package rosy.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VaultDetailScreen {
    public static Target CONTAINER = Target.the("The vault detail screen")
            .located(By.xpath("//*[@content-desc=\"addStoryButton\"]"));

    public static Target BACK_TO_VAULT = Target.the("Back to vault screen")
            .located(By.xpath("(//android.view.ViewGroup[@index='1'])[5]"));

    public static Target VIEW_STORY_BUTTON = Target.the("view story")
            .located(By.xpath("//*[@text='Stories']"));

    //android.widget.TextView[@text='Stories']

    public static Target ADD_YOUR_STORY = Target.the("Add your story button")
            .located(By.xpath("(//android.widget.ImageView[@index='0'])[3]"));

    public static Target ADD_YOUR_STORY2 = Target.the("Add your story button")
            .located(By.xpath("//*[@text='Add Story']"));



  //    (//android.widget.ImageView[@index='0'])[3]

    public  static Target ENABLE_ACCESS= Target.the("Enable Access")
            .located(By.xpath("//android.widget.TextView[@text='Enable Access']"));

    public static Target ALLOW_PERMISSION = Target.the("allow capture and record")
            .located(By.id("com.android.packageinstaller:id/permission_allow_button"));

    public static Target START_RECORDING = Target.the("start recording")
            .located(By.xpath("//*[@content-desc='Record Button']"));

    public  static Target OFFCAMERA= Target.the("Off camera")
            .located(By.xpath("(//android.view.ViewGroup)[16]"));

    public static Target END_RECORDING = Target.the("end recording")
            .located(By.xpath("//*[@content-desc='Record Button']"));

    public static Target SAVE = Target.the("save recording")
            .located(By.xpath("//*[@text=\"Save\"]"));////android.widget.TextView[@text='Save']

//    public static Target UPLOADING = Target.the("uploading label")
//            .located(By.xpath("//*[@text=\"Processing\"]"));

    public static Target UPLOADING = Target.the("uploading label")
            .located(By.xpath("//*[@text=\"a few seconds ago\"]"));

    public static Target PLAY_STORY = Target.the("play story")
            .located(By.xpath("//*[@content-desc='mediaControlToggleButton']"));

    public static Target Thum =Target.the("thum")
            .located(By.xpath("//android.view.ViewGroup/android.widget.FrameLayout"));

    public static Target DELETE_VAULT = Target.the("Delete Vault")
            .located(By.xpath("//*[@text='Delete']")); ////android.widget.TextView[@text='Delete']

    public static Target CONFIRM_DELETE_VAULT = Target.the("agree delete video")
            .located(By.xpath("//android.widget.Button[@text='YES']"));

    public static Target DELETE_STORY = Target.the("delete story")
            .located(By.xpath("(//*[@content-desc=\"PrimaryPanelPillTopButton\"])[1]"));

    public static Target CHOOSE= Target.the("Choose")
            .located(By.xpath("(//android.widget.ImageView[@index='0'])[3]"));

    public static Target DELETE_STORY_ON_PLAY = Target.the("delete story on playing")
            .located(By.xpath("(//*[@content-desc=\"playStoryComponentStoriesDeleteButton\"])[1]"));

    public static Target CONFIRM_DELETE = Target.the("agree delete video")
            .located(By.xpath("//*[@text=\"Yes\"]"));
    public static Target VIEWSTORY = Target.the("Choose one vault")
            .located(By.xpath("//*[@content-desc='storiesView']/android.view.ViewGroup/android.view.ViewGroup"));

    public static Target CANCELSTORY = Target.the("Cancel Story")
            .located(By.xpath("//*[@content-desc='playStoryBackButton']"));

    public static Target CANCEL_TO_VAULT = Target.the("Cancel to vault")
            .located(By.xpath("//*[@content-desc='closeItemViewerScreenButton']"));

    public static Target SCREEN_AFTER_ADD_STORY = Target.the("Screen after add story")
            .located(By.xpath("//*[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));


    public static Target TIMEVIDEO = Target.the("Check play video")
            .located(By.xpath("//android.widget.TextView"));

    public static Target REC = Target.the("REC in screen start story")
            .located(By.xpath("//*[@text='REC']"));

    ////*[@text='REC']



}
