/**
@author Joseph Charland
 */
import java.util.Scanner;
public class DisplayText_Charland {
    public static void main(String[] args) {
        String answer1;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some text: --> ");
        answer1 = input.nextLine();
        do{
            System.out.print("How many lines do you want to display? --> ");
            number = input.nextInt();
        //whileloop to validate input is 1-10
        }while((number < 1) || number > 10);{
            for (int i = 1; i < number +1 ; i++){
                //checking for odd integers and adding *
                if (i%2 == 0){
                    System.out.println(answer1 +"*");
                }else{
                    System.out.println(answer1);
                }
            }
        }
    }
}
