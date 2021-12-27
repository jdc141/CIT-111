import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * TASKS TO COMPLETE
 * 1. Rename file to LastAssignEXC_YourLastName (Change it below and then press the light bulb)
 * 2. Add comments to at least the 13 lines of code labeled "// " 
      LINES TO COMMENT: 15, 20, 23, 26, 28, 30, 35, 37, 42, 46, 50, 71, 75
 * 
 *
 */
public class LabAssignEXC_Charland {

    public static void main(String[] args) {
        //
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        Scanner readIn = new Scanner(System.in);
        int tScore, total = 0, count;
        double average;
        //
        String repeat = "YES";
        
        // 
        while (repeat.equalsIgnoreCase("YES")) 
        {
            //
            do {
                //
                total = 0;
                //
                System.out.print("How many test scores to record? --> ");
                count = readIn.nextInt();
            } while (count < 1);
            
            //
            for (int i = 1; i <= count; ++i) {
                //
                do {
                    System.out.print("Enter test score " + i + ": --> ");
                    tScore = readIn.nextInt();
                } while (tScore < 0 || tScore > 100);
                //
                total += tScore;
            }
            
            // 
            average = (total / (double) count);
            System.out.println("\nThe average of all "  + count + " test scores is " + df.format(average));
            
            // 
            if (average >= 90) 
            {
                System.out.println("The average earns a grade of A");
            } 
            else if (average >= 80 && average < 90) 
            {
                System.out.println("The average earns a grade of B");
            } 
            else if (average >= 70 && average < 80) 
            {
                System.out.println("The average earns a grade of C");
            } 
            else if (average >= 60 && average < 70) 
            {
                System.out.println("The average earns a grade of D");
            } else 
            {
                System.out.println("The average earns a grade of F");
            }
            
            // 
            System.out.print("\nEnter \"yes\" to continue: --> ");
            repeat = readIn.next();
        }
        // 

    }

}
