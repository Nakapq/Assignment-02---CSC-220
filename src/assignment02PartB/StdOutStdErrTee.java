/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * Author: Jack Li
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.*;

public class StdOutStdErrTee extends OutputStream {

    //
    // Static Data Fields
    //
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;
    //
    // Instance Data Fields
    //
    private String stdOutFilePath = "./src/assignment02PartB/log/StandardOut.log";
    private String stdErrFilePath = "./src/assignment02PartB/log/StandardErr.log";
    private OutputStream[] streamsToConsoleToFile;
    //
    // Constructors
    //
    public StdOutStdErrTee(){

    }


    public StdOutStdErrTee(PrintStream printStream, FileOutputStream fileOutputStream){
        this.streamsToConsoleToFile = new OutputStream[2];
        streamsToConsoleToFile[0] = printStream;
        streamsToConsoleToFile[1] = fileOutputStream;
    }
    public StdOutStdErrTee(String stdOutFilePath, String stdErrFilePath){
        this.stdOutFilePath = stdOutFilePath;
        this.stdErrFilePath = stdErrFilePath;
    }


    //
    // Instance Methods
    //
    public void startLog(){
        try {
            FileOutputStream stdOutFile = new FileOutputStream(new File(this.stdOutFilePath));
            FileOutputStream stdErrFile = new FileOutputStream(new File(this.stdErrFilePath));

            StdOutStdErrTee allStdOut = new StdOutStdErrTee(System.out, stdOutFile);
            StdOutStdErrTee allStdErr = new StdOutStdErrTee(System.err, stdErrFile);

            PrintStream stdOut = new PrintStream(allStdOut);
            PrintStream stdErr = new PrintStream(allStdErr);

            System.setOut(stdOut);
            System.setErr(stdErr);

        } catch(FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public void stopLog(){
        System.setOut(originalOut);
        System.setErr(originalOut);
        try {
            PrintStream outStream = System.out;
            PrintStream errStream = System.err;
            if (outStream != originalOut) {
                outStream.close();
            }
            if (errStream != originalErr) {
                errStream.close();
            }
        } catch(Exception e) {
            System.out.println("Error closing streams: " + e.getMessage());
        }
    }
    //
    // Additional Methods
    //
    public String getStdOutFilePath(){
        return this.stdOutFilePath;
    }
    public String getStdErrFilePath(){
        return this.stdErrFilePath;
    }

    //
    // Language
    //

    //
    // Override
    @Override
    public void write(int b) throws IOException {
        for(OutputStream out : this.streamsToConsoleToFile) {
         out.write(b);
         out.flush();
        }
    }
    //
}