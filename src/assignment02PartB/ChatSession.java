/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Scanner;

public final class ChatSession {

    //  Static Data Fields
    private static Player player;

    //
    // Instance Data Fields
    private Club club;
    private University university;
    private String firstName;
    private String userName;
    private String userEmail;
    private String userChat;
    private String clubChat;

    //
    //
    // Constructors
    //
    public ChatSession() {
    }
    public ChatSession(Club club, University university) {
        this.club = club;
        this.university = university;
    }

    //
    // Instance Methods
    //
    private String getPhrase(int i){
        return Messenger.getConfig().getLanguage().getConfigPhrase(i);
    }
    public static Player getPlayer() {
        return player;
    }
    //
    // Additional Instance Methods
    //
    private void startChatSession() {
        Scanner input = new Scanner(System.in);
        clubChat = this.club.getShortName() + ": ";

        System.out.println(Timer.getDateTimeFormatted() + Messenger.getConfig().getTimer().getUserTimeZone() + " - Chat Session Created");
        System.out.println(clubChat + "Welcome to the " + this.club.getShortName().toUpperCase() + "!");
        Card cardGenerator = new Card();
        cardGenerator.getClubCard();
        System.out.print("\n" + clubChat + "Your first name and last name please, ");
        firstName = input.next();
        String lastName = input.next();
        userName = firstName + " " + lastName;
        userChat = userName + ": ";
        input.nextLine();
        System.out.print(clubChat + "Your school email address, please: ");
        userEmail = input.nextLine();
        System.out.print(userChat);
        input.nextLine();
        cardGenerator.getUniversityCard();
    }
    private void connectChatters() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n" + clubChat + "Thank you. We are connecting you with our players. . . \n. . . . .");
        player = new Player("Buster Posey", "San Francisco Giants", "Catcher", 28, "Right", "Right", 2009);
        String playerChat = player.getName() + ", " + player.getNumber() + ": ";
        Card cardGenerator = new Card();
        cardGenerator.getPlayerCard();
        System.out.println(". . . . .");
        System.out.println(playerChat + "Hello " + firstName + ". C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!");
        System.out.println(playerChat + this.university.getSchoolName().toUpperCase() + ". Way to go!");
        System.out.print(userChat);
        input.nextLine();
        System.out.println(playerChat + "Likewise, " + firstName + ". Very nice chatting w/ you.");
        System.out.println(playerChat + "How many SF Giants Thank You cards would you like to order?");
        System.out.print(userChat);
        int numOfCards = input.nextInt();
        input.nextLine();
        System.out.println(playerChat + "In 3 lines, please provide\n     [1] Recipient Name\n     [2] Art symbol (a character)\n     [3] Message to Recipient");
        Card[] cards = new Card[numOfCards];
        for(int i = 0; i < numOfCards; i++) {
            String recipient;
            char artSymbol;
            String message;
            int cardCount = i + 1;
            System.out.print(playerChat + "Card #" + cardCount + "\n");
            System.out.print(userName + ": [1] ");
            recipient = input.nextLine();
            System.out.print(userName + ": [2] ");
            artSymbol = input.nextLine().charAt(0);
            System.out.print(userName + ": [3] ");
            message = input.nextLine();
            cards[i] = new Card(firstName, userEmail, recipient, artSymbol, message);
        }
        System.out.println(playerChat + "Thanks, " + firstName + ". Please confirm your order:");
        for(int i = 0; i < numOfCards; i++) {
            try {
                SFGiantsCardGenerator.generateSFGiantsCard(cards[i].getRecipient(), cards[i].getMessage(), cards[i].getName(), cards[i].getEmail(), cards[i].getArtSymbol(), cards[i].getArtSize(), cards[i].getArtFont());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.print(userName + ": ");
        input.nextLine();
        System.out.println(playerChat + "Thank you again, " + firstName + ". See you at your graduation ceremony!" );
    }
    private void chat() {
    }
    private void runQuiz() {
        Scanner input = new Scanner(System.in);
        int wrongAnswers = 0;
        System.out.println(clubChat + "*** FREE TICKETS TO " + this.club.getShortName().toUpperCase() + " Games *** _ 1 miss allowed _");
        System.out.println(clubChat + "Which type of class has 'protected' constructors?");
        System.out.print(userChat);
        if(input.nextLine().equalsIgnoreCase("abstract")){
            System.out.println(clubChat + "Correct!");
        } else {
            wrongAnswers++;
            System.out.println(clubChat + "Oops...");
        }
        System.out.println(clubChat + "What type of method did Java 8 add to 'interface'?");
        System.out.print(userChat);
        if(input.nextLine().equalsIgnoreCase("default")){
            System.out.println(clubChat + "Correct!");
        } else {
            wrongAnswers++;
            System.out.println(clubChat + "Oops...");
        }
        System.out.println(clubChat + "What new keyword did Java 13 add to 'switch' statement?");
        System.out.print(userChat);
        if(input.nextLine().equalsIgnoreCase("yield")){
            System.out.println(clubChat + "Correct!");
        } else {
            wrongAnswers++;
            System.out.println(clubChat + "Oops...");
        }
        System.out.println(clubChat + "In Java 15, what keyword pairs with 'sealed'?");
        System.out.print(userChat);
        if(input.nextLine().equalsIgnoreCase("permits")){
            System.out.println(clubChat + "Correct!");
        } else {
            wrongAnswers++;
            System.out.println(clubChat + "Oops...");
        }
        System.out.println(clubChat + "Giants in Spanish?");
        System.out.print(userChat);
        if(input.nextLine().equalsIgnoreCase("gigantes")){
            System.out.println(clubChat + "Correct!");
        } else {
            wrongAnswers++;
            System.out.println(clubChat + "Oops...");
        }
        System.out.println(clubChat + "Take me out to the...?");
        System.out.print(userChat);
        if(input.nextLine().equalsIgnoreCase("ball game")){
            System.out.println(clubChat + "Correct!");
        } else {
            wrongAnswers++;
            System.out.println(clubChat + "Oops...");
        }
        if(wrongAnswers > 1) {
            System.out.println("____ PLease try again at your graduation ceremony. ____");
        } else {
            System.out.println("*** Congrats! You won FREE TICKETS to " + this.club.getShortName().toUpperCase() + " Games ***");
        }
    }
    private void stopChatSession() {
        System.out.println(Timer.getDateTimeFormatted() + Messenger.getConfig().getTimer().getUserTimeZone() + " - Chat Session Ended");
    }
    public void runChatSession() {
        startChatSession();
        connectChatters();
        runQuiz();
        stopChatSession();
    }

    //
    // Language
    //
}