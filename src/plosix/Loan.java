
package plosix;

import java.util.Scanner;

public class Loan {
      Scanner sc = new Scanner(System.in);
    
   public void addLoans (){
       System.out.println("Enter your credit score (0-850): ");
        int cscore = sc.nextInt();

        System.out.println("Enter your annual income (in PHP): ");
        double income = sc.nextDouble();

        System.out.println("Enter your existing debt (in PHP): ");
        double edebt = sc.nextDouble();
        
        boolean Approved = true;
        
         if (cscore < 700) {
            Approved = false;
            System.out.println("Loan rejected: Credit score is less than 700.");
        }

        if (income < 300000) {
            Approved = false;
            System.out.println("Loan rejected: Annual income is less than 300,000 PHP.");
        }

        if (edebt > (0.5 * income)) {
            Approved = false;
            System.out.println("Loan rejected: Existing debt exceeds 50% of the annual income.");
        }
       
        if (Approved) {
            System.out.println("Loan approved!");
        } else {
            System.out.println("Loan not approved.");
        }

        sc.close();
   }
    
    
}
