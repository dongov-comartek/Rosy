package rosy.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginScreen {
    public static Target LOGIN_CONTAINER = Target.the("Login screen")
            .located(By.xpath("//*[@content-desc=\"LoginScreen\"]"));

    public static Target EMAIL_FIELD = Target.the("Email field")
            .located(By.xpath("//*[@content-desc=\"email\"]"));


    public static Target PASSWORD_FIELD = Target.the("Password field")
            .located(By.xpath("//*[@content-desc=\"password\"]"));

    public static Target CONTINUE_BUTTON = Target.the("Continue button")
            .located(By.xpath("//*[@text=\"Continue\"]"));

    public static Target PROGRESS_BAR = Target.the("loading")
            .located(By.xpath("//android.widget.ProgressBar"));

    public static Target LOGIN_ACCOUNT = Target.the("rosy account")
            .located(By.xpath("(//android.widget.HorizontalScrollView//android.widget.ImageView)[2]"));

    public static Target ROSY_NUMBER_KEYPAD = Target.the("number {0}")
            .locatedBy("//android.widget.TextView[@text=\"{0}\"]");
}
