/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Directory.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Directory {

    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    private final String path = "./src/assignment02PartB/log/Receipt-*-*.log";
    //

    //
    // Constructors
    //
    public Directory() {
    }

    //
    // Static Methods
    //

    //
    // Instance Methods
    //
    public String getPath(){
        return this.path;
    }
    //
    // Language
    //
}
