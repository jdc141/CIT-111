
/**
@author Joseph Charland
 */
import java.util.Scanner;
import java.util.Random;


public class LabAssign5_Charland {
    public static void main(String[] args) {
        //scanner setup
        Scanner scan = new Scanner(System.in);
        //random setup
        Random rand = new Random();
        //variable setup
        int num, gameNum;
        int numCorrect = 0;  
        int numIncorrect = 0;
        int timesPlayed = 0;
        //using the string repeat method to continuously ask user for a number until user says no. 
        String repeat = "YeS";
        while(repeat.equalsIgnoreCase("YeS"))   
        { 
            do {
                System.out.print("Enter a number within 1-10 --> ");
                //directions say to prompt for a valid number, so we are using .nextInt as input should only be a number. 
                num = scan.nextInt();
                //generates a new number between 1-10, everytime the user guesses. 
                gameNum = rand.nextInt(10)+1;
            }while(num < 1 || num > 10);{
                //times played counter
                timesPlayed++;
                if (num == gameNum){
                    System.out.println("That's right!");
                    //correct counter
                    numCorrect++;
                }
                else{
                    System.out.println("That's wrong, the correct number was " + gameNum);
                    //incorrect counter
                    numIncorrect++;
                }
                System.out.print("Do you want to play again? (Yes/No) --> ");
                //if user says yes, program will continue. 
                repeat = scan.next();
                } 
            }
        System.out.println("--------------------------------");
        System.out.println("Thanks for playing!!!");
        System.out.println("Games Played " + timesPlayed);
        System.out.println("Games Won " + numCorrect);
        System.out.println("Games Lost " + numIncorrect);
        }
        
    }