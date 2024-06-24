/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Card.java
 * @author: Duc Ta
 * @author: Jack Li
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"


public final class Card {

    //
    // Instance Data Fields
    //
    private int artSize = 12;     // Please change artSize, if needed, to get an identical output
    private String artFont = "Courier"; // Please change artFont, if needed, to get an identical output
    private String name;
    private String email;
    private String recipient;
    private char artSymbol;
    private String message;




    //
    // Constructors
    //
    public Card() {
    }
    public Card(String name, String email, String recipient, char artSymbol, String message) {
        this.name = name;
        this.email = email;
        this.recipient = recipient;
        this.artSymbol = artSymbol;
        this.message = message;
    }


    //
    // Instance Methods
    public int getArtSize() {
        return artSize;
    }
    public String getArtFont() {
        return artFont;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getRecipient() {
        return recipient;
    }
    public String getMessage(){
        return message;
    }
    public char getArtSymbol() {
        return artSymbol;
    }
    //

    //
    // Additional Instance Methods
    //
    public void getClubCard() {
        System.out.println(this.getPhrase(0));
        System.out.printf("%-25s %-50s %n", this.getPhrase(10), Messenger.getConfig().getClub().getClubName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(11), Messenger.getConfig().getClub().getShortName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(12), Messenger.getConfig().getClub().getEstablishYear());
        System.out.printf("%-25s %-50s %n", this.getPhrase(13), String.join(", ", Messenger.getConfig().getClub().getColors()));
        System.out.printf("%-25s %-50s %n", this.getPhrase(14), Messenger.getConfig().getClub().getBallPark());
        System.out.printf("%-25s %-50s %n", this.getPhrase(15), Messenger.getConfig().getClub().getNumOfWorldSeries());
        System.out.printf("%-25s %-50s %n", this.getPhrase(16), Messenger.getConfig().getClub().getNumOfNLPenants());
        System.out.printf("%-25s %-50s %n", this.getPhrase(17), Messenger.getConfig().getClub().getNumOfDivisionTitles());
        System.out.printf("%-25s %-50s %n", this.getPhrase(18), Messenger.getConfig().getClub().getNumOfWildCardBerths());
        System.out.printf("%-25s %-50s %n", this.getPhrase(19), Messenger.getConfig().getClub().getOwnerName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(20), Messenger.getConfig().getClub().getPresidentName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(21), Messenger.getConfig().getClub().getGeneralManagerName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(22), Messenger.getConfig().getClub().getManagerName());
        System.out.println(this.getPhrase(0));
    }
    public void getUniversityCard () {
        System.out.println(this.getPhrase(0));
        System.out.printf("%-25s %-50s %n", this.getPhrase(23), Messenger.getConfig().getUniversity().getSchoolName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(24), Messenger.getConfig().getUniversity().getLatinMotto());
        System.out.printf("%-25s %-50s %n", this.getPhrase(25), Messenger.getConfig().getUniversity().getEnglishMotto());
        System.out.printf("%-25s %-50s %n", this.getPhrase(26), Messenger.getConfig().getUniversity().getType());
        System.out.printf("%-25s %-50s %n", this.getPhrase(27), Messenger.getConfig().getUniversity().getEstablishYear());
        System.out.printf("%-25s %-50s %n", this.getPhrase(28), Messenger.getConfig().getUniversity().getLocation());
        System.out.printf("%-25s %-50s %n", this.getPhrase(29), Messenger.getConfig().getUniversity().getAddress());
        System.out.printf("%-25s %-50s %n", this.getPhrase(30), String.join(", ", Messenger.getConfig().getUniversity().getColors()));
        System.out.printf("%-25s %-50s %n", this.getPhrase(31), Messenger.getConfig().getUniversity().getNickname());
        System.out.printf("%-25s %-50s %n", this.getPhrase(32), Messenger.getConfig().getUniversity().getMascot());
        System.out.printf("%-25s %-50s %n", this.getPhrase(33), Messenger.getConfig().getUniversity().getWebsite());
        System.out.println(this.getPhrase(0));
    }
    public void getPlayerCard() {
        System.out.println(this.getPhrase(0));
        System.out.printf("%-25s %-50s %n", this.getPhrase(34), ChatSession.getPlayer().getName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(35), ChatSession.getPlayer().getClub());
        System.out.printf("%-25s %-50s %n", this.getPhrase(36), ChatSession.getPlayer().getPosition());
        System.out.printf("%-25s %-50s %n", this.getPhrase(37), ChatSession.getPlayer().getNumber());
        System.out.printf("%-25s %-50s %n", this.getPhrase(38), ChatSession.getPlayer().getBatHand());
        System.out.printf("%-25s %-50s %n", this.getPhrase(39), ChatSession.getPlayer().getThrowHand());
        System.out.printf("%-25s %-50s %n", this.getPhrase(40), ChatSession.getPlayer().getMlbDebut());
        System.out.println(this.getPhrase(0));
    }

    //
    // Language
    //
    private String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getConfigPhrase(i);
    }

}
