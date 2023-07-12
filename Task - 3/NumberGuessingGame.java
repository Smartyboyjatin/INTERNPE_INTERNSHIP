import java.util.Scanner;
import java.util.Random;

class numberGussingGame{
public static void main(String args[]){
    Scanner reader = new Scanner(System.in);
    String play ="yes";

    while(play.equals("yes")){
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        int guess = -1;
        int tries = 0;
        
        while(guess != randNum){
            System.out.print("guess a number between 1 to 100: ");
            guess = reader.nextInt();
            tries++;

            if(guess == randNum){
                System.out.println("Awesome! you guessed the number!");
                System.out.println("It only took you "+ tries + "guesses!");
                System.out.println("Would you like to play Again: ");
                play = reader.next().toLowerCase();
            }
            else if(guess > randNum){
                System.out.println("Your guess is too high, try Again.");
            }
            else{
                System.out.println("Your guess is too low, try Again");
            }
        }
    }
    reader.close();
}
}