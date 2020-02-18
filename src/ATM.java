
import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        int id;
        Scanner input = new Scanner(System.in);
        Account acct1 = new Account(101, "Mohamad Hamadeh");
        Account acct2 = new Account(102, "Seth Rogan");
// Hello
        acct1.setBalance(50);
        acct1.setAnnualInterestRate(0.05);
        acct2.setBalance(1000);
        acct2.setAnnualInterestRate(0.05);

        System.out.println("Enter an ID: ");
        id = input.nextInt();
        Account acct3 = new Account(id);
        if (id == 101) {
            acct3 = acct1;
        } else if (id == 102) {
            acct3 = acct2;
        }
        if (id == 101 | id == 102) {
            menu(acct3);
        } else {
            System.out.println("Account does not exist");
        }

    }

    public static void menu(Account acct) {
        Scanner input = new Scanner(System.in);
        int menuSelection = 0;
        System.out.println("Main Menu \n 1:Account info \n 2:Withdraw \n 3:Deposit \n 4:Exit \n Please choose what you'd like to do");
        try {
            menuSelection = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
            input.nextLine();
        }
        switch (menuSelection) {
            case 1:
                acct.getCustomerName();
                acct.getBalance();
                acct.monthlyInterest();
                break;
            case 2:
                System.out.println("Enter the amount you would like to withdraw: ");
                double withdrawAmount = input.nextDouble();
                acct.withdraw(withdrawAmount);
                break;
            case 3:
                System.out.println("Enter the amount you would like to deposit: ");
                double depositAmount = input.nextDouble();
                acct.deposit(depositAmount);
                break;
            case 4:
                main(null);
        }
    }

}
