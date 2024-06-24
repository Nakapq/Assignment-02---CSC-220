/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {

    // Instance Data Fields
    private String club;
    private String position;
    private int number;
    private String batHand;
    private String throwHand;
    private int mlbDebut;

    //
    // Constructors
    //
    public Player() {
    }
    public Player(String name, String club, String position, int number, String batHand, String throwHand, int mlbDebut){
        setName(name);
        this.club = club;
        this.position = position;
        this.number = number;
        this.batHand = batHand;
        this.throwHand = throwHand;
        this.mlbDebut = mlbDebut;
    }
    //
    // Instance Methods

    public String getClub() {
        return this.club;
    }
    public String getPosition(){
        return this.position;
    }
    public int getNumber(){
        return this.number;
    }
    public String getBatHand() {
        return this.batHand;
    }
    public String getThrowHand() {
        return this.throwHand;
    }
    public int getMlbDebut() {
        return this.mlbDebut;
    }
    //

    @Override
    public void sayGreeting(String string) {

    }

    //
    // Additional Instance Methods
    //

    //
    // Language
    //

    //
    // @Override
    //
}
