/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Club extends Organization {

    //
    // Instance Data Fields
    //
    private static String clubName;
    private String shortName;
    private int establishYear;
    private String[] colors;
    private String ballPark;
    private int numOfWorldSeries;
    private int numOfNLPenants;
    private int numOfDivisionTitles;
    private int numOfWildCardBerths;
    private OwnerGroup owner;
    private President president;
    private GeneralManager generalManager;
    private Manager manager;

    //
    // Constructors
    //
    public Club(){
    }

    public Club(String defaultClub) {
        this.clubName = "San Francisco Giants";
        this.shortName = "SF Giants";
        this.establishYear = 1883;
        this.colors = new String[]{"Orange", "Black", "Gold", "Cream"};
        this.ballPark = "Oracle Park";
        this.numOfWorldSeries = 8;
        this.numOfNLPenants = 23;
        this.numOfDivisionTitles = 8;
        this.numOfWildCardBerths = 3;
        this.owner = new OwnerGroup("San Francisco Baseball Associates LLC");
        this.president = new President("Farhan Zaidi");
        this.generalManager = new GeneralManager("Scott Harris");
        this.manager = new Manager("Gabe Kapler");
    }
    public Club(String clubName, String shortName, int establishYear, String[] colors, String ballPark, int numOfWorldSeries, int numOfNLPenants, int numOfDivisionTitles, int numOfWildCardBerths, OwnerGroup owner, President president, GeneralManager generalManager, Manager manager){
        this.clubName = clubName;
        this.shortName = shortName;
        this.establishYear = establishYear;
        this.colors = colors;
        this.ballPark = ballPark;
        this.numOfWorldSeries = numOfWorldSeries;
        this.numOfNLPenants = numOfNLPenants;
        this.numOfDivisionTitles = numOfDivisionTitles;
        this.numOfWildCardBerths = numOfWildCardBerths;
        this.owner = owner;
        this.president = president;
        this.generalManager = generalManager;
        this.manager = manager;
    }

    //
    // Static Methods
    //
    public static String getOfficialSong(){
        String officialSong = "Take Me out to the Ball Game";
        return officialSong;
    }
    public String getClubName(){
        return clubName;
    }
    public String getShortName(){
        return shortName;
    }
    public int getEstablishYear(){
        return establishYear;
    }
    public String[] getColors(){
        return colors;
    }
    public String getBallPark(){
        return ballPark;
    }
    public int getNumOfWorldSeries(){
        return numOfWorldSeries;
    }
    public int getNumOfNLPenants(){
        return numOfNLPenants;
    }
    public int getNumOfDivisionTitles(){
        return numOfDivisionTitles;
    }
    public int getNumOfWildCardBerths(){
        return numOfWildCardBerths;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String getPresidentName(){
        return president.getName();
    }
    public String getGeneralManagerName(){return generalManager.getName();}
    public String getManagerName(){
        return manager.getName();
    }

    @Override
    public void displayAbout() {

    }

    @Override
    public void displayMission() {

    }
    //
    // Instance Methods
    //
    //
    // Additional Instance Methods
    //
    //
    // Language
    //
}