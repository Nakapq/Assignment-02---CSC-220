package assignment02PartB;

public class SFGiantsCardGeneratorDriver {
    public static void main(String[] args){
        String senderFirstName = "Mulan";
        String senderEmail = "mulan@sfsu.edu";

        String recipient = "Mom";
        char artSymbol = '@';
        String message = "Trust me. I love your cooking.";

        int artSize = 8;
        String artFont = "Courier";

        try {
            SFGiantsCardGenerator.generateSFGiantsCard(recipient, message, senderFirstName, senderEmail, artSymbol, artSize, artFont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
