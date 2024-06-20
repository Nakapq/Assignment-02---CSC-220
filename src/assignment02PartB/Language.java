/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// java.util.ResourceBundle
// - ResourceBundle is a valid approach to internationalization.
// - ResourceBundle is not required.
// - Other approaches to internationalization are available. Some of these approaches are
// more straightforward and more relevant to new CSC 220 students then ResourceBundle is.
// - Yet, curiosity for intelligence is always highly encouraged:
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ResourceBundle.html

public final class Language {
    //
    // Static Data Fields
    //    
    private static final String defaultAlienSound = "~ ąļīæń ~ "; // Default

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Language() {
    }
    public Language(String language) {

        switch (language.toLowerCase()) {
            case "alien" -> this.populateAlienPhrases();            // Supported
            case "chinese" -> this.populateChinesePhrases();        // Future implementation
            case "french" -> this.populateFrenchPhrases();          // Future implementation
            case "spanish" -> this.populateSpanishPhrases();        // Future implementation
            case "future" -> this.populateYourLanguagePhrases();    // Future implementation
            default -> this.populateEnglishPhrases();               // Supported
        }

    }

    //
    // Static Methods
    //
    public void populateAlienPhrases(){

    }
    public void populateChinesePhrases(){

    }
    public void populateFrenchPhrases(){

    }
    public void populateSpanishPhrases(){

    }
    public void populateYourLanguagePhrases(){

    }
    public void populateEnglishPhrases(){

    }
    //
    // Additional Static Methods
    //
    public static Language displayAppHeader(){
        return null;
    }
    public static Language setLanguagePreference(){
        return null;
    }

    //
    // Instance Methods
    //
    public Language getLanguage(){
        return null;
    }
    public Language getUniversityPhrase(int i){
        return null;
    }
    public Language getClubPhrase(int i){
        return null;
    }
    public String getGreetingPhrase(int i){
        return null;
    }

    public String getConfigPhrase(int i) {
        return null;
    }
    //
    // Language
    //
}