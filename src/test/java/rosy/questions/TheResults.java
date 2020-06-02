package rosy.questions;

import net.serenitybdd.screenplay.Question;

public class TheResults {
    public static Question<String> welcomeText(){return new WelcomeText();}
    public static Question<Boolean> successlogin(){return new SuccessfullLogin();}
    public static Question<String> VaultScreenAfterAdd(){return new AfterAddVaultScreen();}
    public static Question<String> logoutScreen(){return new LogoutScreen();}
    public static Question<Boolean> checkNavigation() {return new CheckNavigation();}
    public static Question<Boolean> vaultScreenIsDisplay(){return new VaultScreenDisplay();}
    public static Question<String> vaultDetailIsDisplay(){return new VaultDetailDisplay();}
    public static Question<String> searchedVaultSummary(){return new SearchedVaultSummary();}
    public static Question<Integer> successfulAddStoryVideo(){return new SuccessfulAddStoryVideo();}
    public static Question<Integer> successfulAddStoryAudio(){return new SuccessfulAddStoryAudio();}
    public static Question<Boolean> addVault(){return new CheckAddVault();}
    public static Question<Boolean> playstory(){return new ViewPlayStory();}
    public static Question<String> checkOpenSearch(){return new CheckOpenSearch();}
    public static Question<String> checkCancelSearch(){return new CheckCancelSearch();}
    public static Question<String> checkStartStory(){return new CheckStartStory();}
    public static Question<String> checkOpenFeedBack(){return new CheckOpenFeedBack();}

}
