/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class University extends Organization {
    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //
    private String schoolName;
    private String latinMotto;
    private String englishMotto;
    private String type;
    private int establishYear;
    private String location;
    private String address;
    private String[] colors;
    private String nickname;
    private String mascot;
    private String website;
    //
    // Constructors
    //
    public University() {
    }

    public University(String defaultUniversity) {
        this.schoolName = "San Francisco University";
        this.latinMotto = "Expertia Docet";
        this.englishMotto = "Experience Teaches";
        this.type = "Public";
        this.establishYear = 1899;
        this.location = "San Francisco, California, United States";
        this.address = "1600 Holloway Avenue, San Francisco, CA 94132";
        this.colors = new String[]{"Purple", "Gold"};
        this.nickname = "Gators";
        this.mascot = "Gator";
        this.website = "www.sfsu.edu";
    }

    //
    // Instance Methods
    //
    public String getSchoolName(){
        return this.schoolName;
    }
    public String getLatinMotto(){
        return this.latinMotto;
    }
    public String getEnglishMotto(){
        return this.englishMotto;
    }
    public String getType(){
        return this.type;
    }
    public int getEstablishYear() {
        return establishYear;
    }
    public String getLocation() {
        return location;
    }
    public String getAddress() {
        return address;
    }
    public String[] getColors() {
        return colors;
    }
    public String getNickname() {
        return nickname;
    }
    public String getMascot() {
        return mascot;
    }
    public String getWebsite() {
        return website;
    }
    @Override
    public void displayAbout() {

    }

    @Override
    public void displayMission() {

    }
    //
    // Additional Methods
    //

    //
    // Language
    //

    //
    // Override
    //
}