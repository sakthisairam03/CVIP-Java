import java.util.Scanner;
public class atm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to XYZ ATM!!");
        System.out.println("Insert ATM card.");
        System.out.print("Enter your pin: ");
        int pinnum=sc.nextInt();
        if (pinnum==0000){
            System.out.println("-------------------");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdrawal");
            System.out.println("3. Deposit");
            System.out.println("4. Quit");
            System.out.println("-------------------");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Account Balance: Rs.37000");
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: Rs.");
                    double withdrawalamount=sc.nextDouble();
                    if(withdrawalamount<=37000){
                        System.out.println("Please collect your money.");
                        System.out.println("Remaining Balance: Rs." + (37000-withdrawalamount));
                    }else{
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 3:
                    System.out.print("Enter deposit amount: Rs.");
                    double depositamount=sc.nextDouble();
                    System.out.println("Deposit Success!!");
                    System.out.println("Updated Balance: Rs." + (37000+depositamount));
                    break;
                case 4:
                    System.out.println("Thank you. Visit again!!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }else{
            System.out.println("Invalid PIN.");
        }
        sc.close();
    }
}