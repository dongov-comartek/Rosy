package rosy.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomeScreen {
    public static Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("(//*[@text=\"Log in\"])[1]"));
    public static Target CREATE_ACCOUNT_BUTTON = Target.the("create account button")
            .located(By.xpath("(//*[@text=\"Create account\"])[1]"));

    public static Target ACCOUNT_WELCOME_CONTAINER = Target.the("Welcome account")
            .located(By.xpath("//*[@text=\"Do you want to enable quick login with biometrics?\"]"));


    public static Target WELCOME_TEXT = Target.the("welcome text")
            .located(By.xpath("//*[@text=\"Welcome back,\"]"));
}
