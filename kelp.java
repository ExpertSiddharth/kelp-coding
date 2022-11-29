import java.util.*;
public class kelp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // account created Acc001
        String name1 = "kelp";
        System.out.println("Acc001 " + name1);

        // Deposite Acc001

        System.out.print("Enter amount you want to Deposit at kelp Rs.");
        int a = sc.nextInt();
        System.out.println("Amount Deposited Acc001 kelp Rs." +a);

        //withdraw Acc001

        System.out.print("Enter amount you want to withdraw From kelp Rs.");
        int b = sc.nextInt();
        System.out.println("Amount withdrawn Acc001 kelp Rs." +b);


         // balance Acc001

        int balance = a - b;
        System.out.println("Balance amount in Acc001 kelp is Rs." +balance);


          // account created Acc002

        String name2 = "FVPTL";
        System.out.println("Ac002 " + name2);

        // Deposite Acc002

        System.out.print("Enter amount you want to Deposit at FVTPL Rs.");
        int c = sc.nextInt();
        System.out.println("Amount Deposited Acc002 FVTPL Rs." +a);

        //withdraw Acc02

        System.out.print("Enter amount you want to withdraw From FVTPL Rs.");
        int d = sc.nextInt();
        System.out.println("Amount withdrawn from Acc002 FVTPL Rs." +b);


        // balance Acc002
        int balance1 = c - d;
        System.out.println("Balance amount in Acc002 FVTPL is Rs." +balance1);
        

    }
}