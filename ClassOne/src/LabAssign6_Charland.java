/**
@author Joseph Charland
 */
import java.util.Scanner;

public class LabAssign6_Charland {
    public static void main(String[] args) {
        //variable declaration
        double number1, number2, answer;
        int choice;
        //initalize scanner
        Scanner input = new Scanner(System.in);
        System.out.println("***Welcome to the Simple Calculator***");
        System.out.println("--------------------------------------");
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        do {
            System.out.println("Please Select one of the following options: ");
            System.out.println("1 to Add");
            System.out.println("2 to Subtract");
            System.out.println("3 to Multiply");
            System.out.println("4 to Divide");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
        //choice validation between 1-4  
        }while (choice < 1 || choice > 4);{
        //controll structure (using a switch as netbeans kept giving me a yellow line for a chained if statement. 
            switch (choice){
                case 1:
                    answer = calcSum(number1, number2);
                    break;
                case 2:
                    answer = calcSub(number1, number2);
                    break;
                case 3:
                    answer = calcMul(number1, number2);
                    break;
                case 4:    
                    answer = calcDiv(number1, number2);
                    break;
                default:
                    answer = 0;
            }
            displayResults(answer);
        }
    }
    //addition method
    public static double calcSum(double d1, double d2) {
        return d1 + d2;
    //subtraction method    
    }public static double calcSub(double d1, double d2) {
        return d1 - d2;
    //multiply method    
    }public static double calcMul(double d1, double d2) {
        return d1 * d2;
    //division method    
    }public static double calcDiv(double d1, double d2) {
        return d1 / d2;
    //sout results method    
    }public static void displayResults(double ans) {
        System.out.println("the answer is " + ans);
    }
    
}
