/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: Jack Li
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

import java.util.Scanner;


public final class Language {
    //
    // Static Data Fields
    //
    private static final String defaultAlienSound = "~ ąļīæń ~ "; // Default
    private static String userLanguage;
    private static String greetingPhrase;
    private static Language languagePreference;
    private static Language appHeader;
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
        System.out.println("Gorp Zorp");
    }
    public void populateChinesePhrases(){
        System.out.println("Ni Hao");
    }
    public void populateFrenchPhrases(){
        System.out.println("Bonjour");
    }
    public void populateSpanishPhrases(){
        System.out.println("Hola");
    }
    public void populateYourLanguagePhrases(){
        System.out.println("djklsa");
    }
    public void populateEnglishPhrases(){
    }

    //
    // Additional Static Methods
    //
    public static Language displayAppHeader(){
        Scanner input = new Scanner(System.in);
        System.out.println(Config.getOfficialAppHeader());
        System.out.print("Language: ");
        userLanguage = input.nextLine();
        languagePreference = new Language(userLanguage);
        System.out.print("Time Zone: ");
        String userTimeZone = input.nextLine();
        Messenger.getConfig().getTimer().setTimeZone(new Timer(userTimeZone));
        return appHeader;
    }
    public static Language setLanguagePreference(){
        Messenger.getConfig().setLang(languagePreference);
        return languagePreference;
    }

    //
    // Instance Methods
    //
    public String getLanguage(){
        if(userLanguage.equalsIgnoreCase("alien")){
            return defaultAlienSound;
        } else {
            return "ENGLISH";
        }
    }
    public String getUniversityPhrase(int i){
        if (i == 0) {
            return Config.getDefaultUniversity();
        }
        return null;
    }
    public String getClubPhrase(int i){
        if (i == 0) {
            return Config.getDefaultClub();
        }
        return null;
    }
    public String getGreetingPhrase(int i){
        return greetingPhrase;
    }
    public String getConfigPhrase(int i) {
        String result = "";
        switch (i) {
            case 0 -> result = "----------------------------------------------------------------------";
            case 1 -> result = "Language:";
            case 2 -> result = "Time Zone:";
            case 3 -> result = "Color Sequeunces:";
            case 4 -> result = "Standard Output Log:";
            case 5 -> result = "Standard Error Log:";
            case 6 -> result = "Receipt Log:";
            case 7 -> result = "";
            case 8 -> result = "Default University:";
            case 9 -> result = "Default Club:";
            case 10 -> result = "Club:";
            case 11 -> result = "Short Name:";
            case 12 -> result = "Established in:";
            case 13 -> result = "Colors:";
            case 14 -> result = "Ballpark:";
            case 15 -> result = "World Series Titles:";
            case 16 -> result = "NL Pennants;";
            case 17 -> result = "Division Titles:";
            case 18 -> result = "Wild Card Berths:";
            case 19 -> result = "Owners:";
            case 20 -> result = "President:";
            case 21 -> result = "General Manager:";
            case 22 -> result = "Manager";
            case 23 -> result = "Official Name:";
            case 24 -> result = "Motto in Latin:";
            case 25 -> result = "Motto in English:";
            case 26 -> result = "Type:";
            case 27 -> result = "Year of Establishment:";
            case 28 -> result = "Location:";
            case 29 -> result = "Address:";
            case 30 -> result = "Colors:";
            case 31 -> result = "Nickname:";
            case 32 -> result = "Mascot:";
            case 33 -> result = "Website:";
            case 34 -> result = "Player:";
            case 35 -> result = "Club:";
            case 36 -> result = "Position:";
            case 37 -> result = "Number:";
            case 38 -> result = "Bats:";
            case 39 -> result = "Throws:";
            case 40 -> result = "MLB Debut:";
        }
        return result;
    }
    //
    // Language
    //

}