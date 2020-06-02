package rosy.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import rosy.abilities.Authenticate;
import rosy.actions.Wait;
import rosy.questions.TheResults;
import rosy.tasks.*;
import rosy.ui.FeedBackSreen;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class SmokeTest {
    Actor anna = Actor.named("The User")
            .whoCan(Authenticate.withCredential());

    @Managed(uniqueSession = true, driver = "Appium")
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void show_home_screen_after_logged_in_with_rosy_account() {
        anna.attemptsTo(
                OpenLogin.open(),
                Login.withEmail("auto2@rosy.com").andPassword("12345")

           //     Wait.aBit(10).inSecond()

        );
        anna.should(
           //    seeThat(TheResults.welcomeText(), equalTo("Do you want to enable quick login with biometrics?"))
               seeThat(TheResults.successlogin(), equalTo(true))
        );
        //Cancel Biometric
//        anna.attemptsTo(
//                Biometrics.Cancel()
//        );
//        anna.should(
//
//        );
        //Open left menu
          anna.attemptsTo(
                  Wait.aBit(5).inSecond(),
                  Navigate.show());
          anna.should(
                  seeThat(TheResults.checkNavigation(), equalTo(true))
          );

        //Hide left menu
          anna.attemptsTo(
                  Wait.aBit(3).inSecond(),
                  Navigate.hide()
          );
          anna.should(
                  seeThat(TheResults.checkNavigation(), equalTo(false))
          );
        //go to tab vault
        anna.attemptsTo(
                OpenVault.open()
        );
        anna.should(
                seeThat(TheResults.searchedVaultSummary(), equalTo("Photos"))
        );

        //filter with document
        anna.attemptsTo(
                FilterVault.Photos()
        );
        anna.should(
            //    seeThat(TheResults.searchedVaultSummary(), equalTo("Documents"))
        );

        //Open Search
        anna.attemptsTo(
                OpenSearch.open()
        );
        anna.should(
                seeThat(TheResults.checkOpenSearch(), equalTo("Search Vault"))
        );
        //Search
        anna.attemptsTo(
                SearchVault.keyword("tree").run()
        );
        anna.should(
        );
        //CancelSearch
        anna.attemptsTo(
                CancelSearch.cancel()
        );
        anna.should(
                seeThat(TheResults.checkCancelSearch(),equalTo("What can I help you find?"))

        );
        // Add to vault
        anna.attemptsTo(
                AddVaultImage.add()
        );
        anna.should(
                seeThat(TheResults.VaultScreenAfterAdd(), equalTo("Tap for new items"))
        );

/*

      //DeleteVault
        anna.attemptsTo(
                DeleteVault.at(0)
        );
        anna.should(
                seeThat(TheResults.searchedVaultSummary(), equalTo("Vault"))
        );


 */
//        anna.attemptsTo(
//                AddVault.add()
//        );
//        anna.should(
//                seeThat(TheResults.addVault(),equalTo(false))
//        );


        //OpendetailVault
        anna.attemptsTo(
                ViewVault.at(0)

        );
        anna.should(
                seeThat(TheResults.vaultDetailIsDisplay(), equalTo("Stories"))
        );
        //AddStoryVideo
        anna.attemptsTo(
               AddStoryVideo.add()
        );
        anna.should(
                seeThat(TheResults.checkStartStory(), equalTo("Save"))
              //  seeThat(TheResults.successfulAddVault(), equalTo(true))
        );
        //SaveStoryVideo
        anna.attemptsTo(
                SaveStory.saveStory()

        );
        anna.should(
                seeThat(TheResults.successfulAddStoryVideo(),equalTo(1))
        );

        //OpenStoryVideo
        anna.attemptsTo(
                OpenStory.at(0)
        );
        anna.should(
           //    seeThat(TheResults.vaultDetailIsDisplay(), equalTo("Stories"))
        );
        //PlaystoryVideo
        anna.attemptsTo(
               PlayStory.play()
        );
        anna.should(
                     seeThat(TheResults.playstory(), equalTo(true))
        );

        //AddStoryAudio
        anna.attemptsTo(
                ToVaultDetail.run(),
                AddStoryAudio.add()
        );
        anna.should(
                seeThat(TheResults.checkStartStory(), equalTo("Save"))
                //  seeThat(TheResults.successfulAddVault(), equalTo(true))
        );
        //SaveStoryVideo
        anna.attemptsTo(
                SaveStory.saveStory()

        );
        anna.should(
                seeThat(TheResults.successfulAddStoryAudio(),equalTo(1))
        );

        //OpenStoryVideo
        anna.attemptsTo(
                OpenStory.at(0)
        );
        anna.should(
                //     seeThat(TheResults.vaultDetailIsDisplay(), equalTo("Stories"))
        );
        //PlaystoryVideo
        anna.attemptsTo(
                PlayStory.play()
        );
        anna.should(
                seeThat(TheResults.playstory(), equalTo(true))
        );

        //FeedBack
        anna.attemptsTo(
                OpenFeedBack.inputFeedBack("test automatic").input()
        );
        anna.should(
                seeThat(TheResults.checkOpenFeedBack(),equalTo("Send Feedback"))
        );

        //Logout
        anna.attemptsTo(
                Click.on(FeedBackSreen.CANCEL_BUTTON),
                Logout.click()
        );
        anna.should(
                seeThat(TheResults.logoutScreen(), equalTo("Welcome back,"))
        );


    }


}
