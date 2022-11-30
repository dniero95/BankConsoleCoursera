import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menuText = "Bank Admin Menu\n" +
                "Please Enter a Menu Option\n" +
                "(1): Add Customer to Bank\n" +
                "(2): Change Customer Name\n" +
                "(3): Check Account Balance\n" +
                "(4): Modify Account Balance\n" +
                "(5): Summary of All Accounts\n" +
                "(-1): Quit";
        System.out.println(menuText);
        int userInput;
        Scanner input = new Scanner(System.in);

        ArrayList<Account> accounts = new ArrayList<>();
        double balance;
        String name;
        int id;

        do {
            System.out.print(" >>> ");
            userInput = input.nextInt();
            input.nextLine();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Bank Add Customer Menu:");
                    System.out.print("Please enter an account name: ");

                    name = input.nextLine();
                    System.out.print("Please enter an account balance: ");
                    balance = input.nextDouble();
                    input.nextLine();

                    Account newAccount = new Account(name, balance);
                    accounts.add(newAccount);
                    System.out.println("Customer ID is:" + newAccount.getId());
                }
                case 2 -> {
                    System.out.println(("Bank Change Name Menu:"));
                    System.out.print("Please enter Account ID: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.print("Please enter new name: ");
                    name = input.nextLine();
                    accounts.get(id).setName(name);
                }
                case 3 -> {
                    System.out.println(("Bank Check Account Balance Menu:"));
                    System.out.print("Please enter Account ID: ");
                    id = input.nextInt();
                    input.nextLine();

                    System.out.println("The Account Balance is: " + accounts.get(id).getBalance());
                }
                case 4 -> {
                    System.out.println(("Bank Modify Account Balance Menu:"));
                    System.out.print("Please enter Account ID: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.print("Please enter new balance: ");
                    balance = input.nextDouble();
                    input.nextLine();
                    accounts.get(id).setBalance(balance);
                }
                case 5 -> {
                    System.out.println("Summary of All Accounts");
                    for (Account account :
                            accounts) {
                        System.out.println(account);
                    }
                }
                case -1 -> System.out.println("Goodbye!");
                default -> System.out.println("Error! No valid Option");
            }
        } while (userInput != -1);

        input.close();


    }
}