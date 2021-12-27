/**
@author Joseph Charland
 */
import java.util.Scanner;

public class FinalExam_Charland {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        double kilometers, miles;
        String repeat = "YES";
        while (repeat.equalsIgnoreCase("YES")){
        kilometers = getValidKM();
        miles = calculateMiles(kilometers);
        displayResults(kilometers, miles);
        System.out.print("Enter \"YES\" to convert again: ");
        repeat = scan.next();
        }
    }
    public static double getValidKM(){
        Scanner userInput = new Scanner(System.in);
        double userNumber;
        do {
            System.out.print("input a # of kilometers ---> : ");
            userNumber = userInput.nextDouble();
        }while (userNumber <= 0) ;{
            return userNumber;
        }    
    }
    public static double calculateMiles(double km){
        double miles = km * 0.62137119;
        return miles;
    }
    public static void displayResults(double k, double m){
        System.out.println(k + " Kilometers is equivalent to " + m + " miles.");
    }
}
