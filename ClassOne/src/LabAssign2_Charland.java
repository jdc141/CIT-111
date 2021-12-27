/**
 *
 * @author Joseph Charland
 */
import java.util.Scanner;

public class LabAssign2_Charland {
    public static void main(String[] args) {
        //initalizing variables, changed to ints
        final int COOKIES_PER_BOX = 35;
        final int SERVINGS_IN_BOX = 10;
        final int CALORIES_PER_SERVING = 250;
        double cookiesPerServing = COOKIES_PER_BOX / (double) SERVINGS_IN_BOX;
        double caloriesPerCookie = CALORIES_PER_SERVING / cookiesPerServing ; 
        //initalizing Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of cookies eaten: --> ");
        //asking user input... double variable type as user could eat a fractional amount.
        double amountOfCookies = input.nextDouble();
        //calculations from what user put in, double to avoid type error. 
        double totalCaloriesAte = amountOfCookies * caloriesPerCookie;
        //total calories output
        System.out.println("The total number of calories consumed: " + totalCaloriesAte);
        
        
    }
    
}
