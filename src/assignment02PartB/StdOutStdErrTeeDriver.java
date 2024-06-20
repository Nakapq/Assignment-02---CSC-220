package assignment02PartB;

import java.util.Scanner;

public class StdOutStdErrTeeDriver {
        private static String stdOutFile = "./src/csc220SandBox05/asmt02MoreHelpStandardOut.log";
        private static String stdErrFile = "./src/csc220SandBox05/asmt02MoreHelpStandardErr.log";
        public static StdOutStdErrTee configTee = new StdOutStdErrTee(stdOutFile, stdErrFile);

        public static void main(String[] args) {
            StdOutStdErrTeeDriver.configTee.startLog();

            Scanner input = new Scanner(System.in);
            System.out.print("Can we do this : ");
            System.out.println("Can we do this? -> Answer: " + input.nextLine());

            System.out.println("SAMPLE RUN:");
            System.out.println("Please look in the current package for the newly created 2 files:");
            System.out.println("1. \"asmt02MoreHelpStandardOut.log\" has a copy of standard output in the console.");
            System.out.println("2. \"asmt02MoreHelpStandardErr.log\" has a copy of standard error in the console.");

            StdOutStdErrTee.stopLog();
        }
}
