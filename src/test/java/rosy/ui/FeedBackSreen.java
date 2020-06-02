package rosy.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FeedBackSreen {
    public static Target BUTTON_SEND_FEEDBACK = Target.the("Button send feedback")
            .located(By.xpath("//*[@text='Send Feedback']"));
    public static final Target FEEDBACK_BUTTON = Target.the("Feedback button")
            .located(By.xpath("//*[@text=\"Feedback\"]/.."));
    public static final Target TEXT_FEEDBACK = Target.the("text Feedback ")
            .located(By.xpath("//android.widget.EditText"));
    public static final Target CANCEL_BUTTON = Target.the("cancel Feedback button")
            .located(By.xpath("//*[@text=\"Cancel\"]"));
}
