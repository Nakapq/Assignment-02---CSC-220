/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StdOutStdErrTee extends OutputStream {

    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //
    private String stdOutFilePath;
    private String stdErrFilePath;
    private OutputStream[] streamsToConsoletoFile;
    //
    // Constructors
    //
    public StdOutStdErrTee(){

    }
    public StdOutStdErrTee(OutputStream printStream, OutputStream fileOutputStream){
        this.streamsToConsoletoFile = new OutputStream[2];
        streamsToConsoletoFile[0] = printStream;
        streamsToConsoletoFile[1] = fileOutputStream;
    }
    public StdOutStdErrTee(String stdOutFilePath, String stdErrFilePath){
        this.stdOutFilePath = stdOutFilePath;
        this.stdErrFilePath = stdErrFilePath;
    }

    public StdOutStdErrTee(PrintStream out, FileOutputStream stdOutFile) {
        super();
    }

    //
    // Instance Methods
    //
    public void startLog(){
        try{
            FileOutputStream stdOutFile = new FileOutputStream(new File(this.stdOutFilePath));
            FileOutputStream stdErrFile = new FileOutputStream(new File(this.stdErrFilePath));

            StdOutStdErrTee allStdOut = new StdOutStdErrTee(System.out, stdOutFile);
            StdOutStdErrTee allStdErr = new StdOutStdErrTee(System.err, stdErrFile);

            PrintStream stdOut = new PrintStream(String.valueOf(allStdOut));
            PrintStream stdErr = new PrintStream(String.valueOf(allStdErr));

            System.setOut(stdOut);
            System.setOut(stdErr);
        } catch(FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public static void stopLog(){

    }
    public String getStdOutFilePath(){
        return this.stdOutFilePath;
    }
    public String getStdErrFilePath(){
        return this.stdErrFilePath;
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