/**
 *
 * @author Joe
 */
import java.util.Scanner;

public class LabAssign3_Charland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in the range of 1 - 10: --> ");
        //instructions says specifically for "numbers out of range, therefore we should use an INT"
        int UserNumber = input.nextInt();
        if (UserNumber == 1){
        System.out.println("I");
        }
        else if (UserNumber == 2){
        System.out.println("II");
        }
        else if (UserNumber == 3){
        System.out.println("III");
        }
        else if(UserNumber == 4){
        System.out.println("IV");
        }
        else if (UserNumber == 5){
        System.out.println("V");
        }
        else if (UserNumber == 6){
        System.out.println("VI");
        }
        else if (UserNumber == 7){
        System.out.println("VII");
        }
        else if (UserNumber == 8){
        System.out.println("VIII");
        }
        else if (UserNumber == 9){
        System.out.println("IX");
        }
        else if (UserNumber == 10){
        System.out.println("X");
        }
        //line will throw an error if user input is other than an int. (char, double, etc)
        else {
        System.out.println("Invalid Number");
        }
    }
    
}
