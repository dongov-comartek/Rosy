package rosy.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import rosy.questions.TheResults;
import rosy.tasks.Biometrics;
import rosy.tasks.Navigate;
import rosy.tasks.OpenVault;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class HomeStory {
    Actor anna = Actor.named("The User");

    @Managed(driver = "Appium")
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }
/*
    @Test
    public void show_the_detected_location_after_allow_access_permission()
    {
        anna.attemptsTo(
                LocationPermission.Allow()
        );
        anna.should(
                seeThat(
                        TheResults.detectedLocation(), startsWith("Hà Nội")
                )
        );
    }
*/
@Test
        public void qick_login_with_biomerics()
        {
            anna.attemptsTo(/*Biometrics.Cancel()
            */);
        }

    @Test
    public void expand_and_collap_navigation_bar()
    {
        anna.attemptsTo(Navigate.show());
        anna.should(seeThat(TheResults.checkNavigation(), equalTo(true)));

        anna.attemptsTo(Navigate.hide());
        anna.should(seeThat(TheResults.checkNavigation(), equalTo(false)));
    }

    @Test
    public void show_the_corresponding_screen_after_tap_on_each_navigation_item()
    {
        anna.attemptsTo(OpenVault.open());
        anna.should((seeThat(TheResults.vaultScreenIsDisplay(), equalTo(true))));
    }
}
