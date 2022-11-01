import java.util.Random;
import java.util.Scanner;
public class NOT_Dice {
    public static void main(String[] args) {
        //Set variables to 0
        int dice1 = 0;
        int dice2 = 0;
        int when = 0;

        Scanner objScanner = new Scanner(System.in);
        System.out.println("How many times should I roll the dice?");
        int rolls = objScanner.nextInt();

        //Loop ??? times
        for (int i = 1; i < rolls+1; i++) {
            //Roll each dice
            dice1 = roll(6);
            dice2 = roll(6);

            //Show each roll.
            if(!((dice1 == 6) || (dice2 == 6))){
                System.out.println("Dice1 = " + dice1 + " Dice2 = " + dice2);
            } else {
                //Highlight any 6
                System.out.println("Dice1 = " + dice1 + " Dice2 = " + dice2 + " *** SIX! ***");

                //set the counter
                when = i;

                //Break the loop, no point looking further
                break;
            }
        }

        //Show when the 6 happened.
        if (when > 0) {
            System.out.println("A 6 was thrown after " + when + " attempts.");
        } else {
            System.out.println("Bad luck! A 6 was not thrown after " + rolls + " attempts.");
        }
    }

    private static int roll(int sides) {
        //Return int between 1 and # of sides - always 6 at present lol.
        Random random = new Random();
        return random.nextInt(sides ) +1; // 1 to #sides

    }


}
