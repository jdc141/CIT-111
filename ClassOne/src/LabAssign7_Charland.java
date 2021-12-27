/**
@author Joseph Charland
 */
import java.util.Scanner;
import java.util.Random;

public class LabAssign7_Charland {
    public static void main(String[] args) {
        //initalizing variables needed in scope
        int peopleNum;
        int randomTicketNumber;
        do {
            //returns an int
            peopleNum = numberOfPeople();
        }while (peopleNum <= 0);{
            //initalizing array
            String[] nameList = new String[peopleNum];
            namesIntoArray(nameList);
            //generates randomTicketNumber
            randomTicketNumber = randomTicketGenerator(nameList);
            System.out.println("***********************************************");
            System.out.println("The Winner is : " + nameList[randomTicketNumber]);
        }
    }
    //prompts the user of the number of people they would like to add. 
    public static int numberOfPeople(){
        Scanner numberInContestInput = new Scanner(System.in);
        System.out.print("How many people are in the drawing? ");
        return numberInContestInput.nextInt();
    }
    //generates a random number between 0 and the length of the array (which is the specified number in the numberOfPeople method.) 
    public static int randomTicketGenerator(String arr[]){
        Random rand = new Random();
        int ticketNumber;
        ticketNumber = rand.nextInt(arr.length);
        return ticketNumber;
    }
    //asks for user input, adds names to the array, continues looping until the counter reaches the specified amount from the numberOfPeople Method
    public static String[] namesIntoArray(String arr[]){
        Scanner nameInput = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            int enteringNumber = i + 1;
            System.out.print("Please enter name #" + enteringNumber + ": ");
            arr[i] = nameInput.next();
        }
        return arr;
    }
}
