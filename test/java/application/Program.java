package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Account account;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: \n");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println(" Is there an initial deposit (y/n)?\n");
       char response = sc.next().charAt(0);
       if( response == 'y'){
            System.out.println("Enter initial deposit value:");
            double initialDeposit = sc.nextDouble();
            account = new Account(holder, number, initialDeposit);
       }else{
           account = new Account(holder, number);
       }
        System.out.println();
        System.out.println("Account Data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value:");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();

    }
}
