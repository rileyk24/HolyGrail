
/**
 * Simple I/O project using scanner
 * @version 09.23.22
 * @author Riley Kim
 */

import java.util.Scanner;

public class HolyGrail {
    /** main method of class Holy Grail
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) {
        // declaring local variables, only known in this area
        String name, quest, color;
        Scanner in = new Scanner(System.in);
        //getting user input
        System.out.println("* A chat with the bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these\n" +
                "questions three, ere the other side he see.");

        System.out.print("What is your name?");
        name = in.nextLine();

        System.out.print("What is your quest?");
        quest = in.nextLine();
        System.out.print("What is your favorite color?");
        color = in.nextLine();

        // summary of user input
        System.out.println("King Arthur says, \"You have to know these things when you're a\n" +
                "king, you know.\"");
        System.out.println("Your name is: "+ name );
        System.out.println("Your quest is: "+ quest);
        System.out.println("Your favorite color is: "+ color);
        System.out.println("* end of program *");

    }
}