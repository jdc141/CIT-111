/**
 *
 * @author Joseph Charland
 */
import java.util.Scanner;
public class LabAssign4_Charland {
    public static void main(String[] args) {
        
        String userAnswer1; 
        String quizAnswer1; 
        int amountCorrect = 0;
        Scanner input = new Scanner(System.in);
        
        //question 1
        System.out.print("What is the name of the Pittsburgh football team? (one word) ---> ");
        quizAnswer1 = "Steelers";
        userAnswer1 = input.nextLine();
        if (userAnswer1.equalsIgnoreCase(quizAnswer1)){
            System.out.println("Correct!");
            amountCorrect+=1; 
        }
        else {
            System.out.println("Wrong!");
                }
        //question 2
        System.out.print("What is the acronym for the school you attend ---> ");
        quizAnswer1 = "CCAC";
        userAnswer1 = input.nextLine();
        if (userAnswer1.equalsIgnoreCase(quizAnswer1)){
            System.out.println("Correct!");
            amountCorrect+=1; 
        }
        else {
            System.out.println("Wrong!");
                }
        //question 3
        System.out.print("What is Sidney Crosby's number? (in number format) ---> ");
        quizAnswer1 = "87";
        userAnswer1 = input.nextLine();
        if (userAnswer1.equalsIgnoreCase(quizAnswer1)){
            System.out.println("Correct!");
            amountCorrect+=1; 
        }
        else {
            System.out.println("Wrong!");
                }
        
        
        System.out.println("***************************************************");
        System.out.println("You got " +  amountCorrect + " out of 3 questions corect. ");
        System.out.println("***************************************************");
    }
    
}
