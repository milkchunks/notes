import java.util.Scanner;

public class BankAccount {
    Scanner globalScanner = new Scanner(System.in);
    boolean looper;
    private String name;
    private String userID;
    private Double balance = 0.0;
    private Integer previousTrans;
    private Double newAmount = 0.0;
    String[] split1;
    private String input;
    private String input2 = "0";
    private Double newBalance;
    public BankAccount() {
        System.out.println("Set your name (first and last) and your User ID, separated by a comma (Example: Forename Surname, User ID).");
        this.name = name;
        this.userID = userID;
        this.name = name;
        //this.balance = balance;
        String split = globalScanner.nextLine();
        split1 = split.split(", ");
    }

    public String getName() {
        name = split1[0];
        return this.name = name;
    }

    public String getUserID() {
        userID = split1[1];
        return this.userID = userID;
    }
    public Double setAmount() {
        if (input.equals("2") || input.equals("3")) {
            newAmount = globalScanner.nextDouble();
            return newAmount;
        } else if (input.equals("4")) {
            return newAmount;
        }
        return newAmount;
    }
    public Double deposit() {
            balance = balance + setAmount();
            previousTrans = 0;
            return balance / 2;
    }
    public Double withdraw() {
            balance = balance - setAmount();
            previousTrans = 1;
            return balance / 2;
    }
    public Double setBalance() {
        switch (input2) {
            case "2":
                return deposit();
            case "3":
                return withdraw();
            default:
                return 0.0;
        }
    }
    public void menu() {
        System.out.println("Input your name and user ID to proceed.");
        looper = true;
        String credentialsInput = globalScanner.nextLine();
        String[] credentialsInputParsed = credentialsInput.split(", ");
        String inputtedName = credentialsInputParsed[0];
        String inputtedID = credentialsInputParsed[1];
        while (looper) {
            if (inputtedName.equals(getName()) && inputtedID.equals(getUserID())) {
                Scanner tempScanner = new Scanner(System.in);
                    System.out.println("1. Check balance");
                    System.out.println("2. Deposit money");
                    System.out.println("3. Withdraw money");
                    System.out.println("4. Check previous transaction");
                    System.out.println("5. Exit");
                    input = tempScanner.nextLine();
                switch (input) {
                    case "1":
                        if (setBalance() != 0) {
                            System.out.println(".........................");
                            System.out.printf("Your balance is $%.2f\n", setBalance());
                            System.out.println(".........................");
                        } else {
                            input2 = "0";
                            System.out.println(".........................");
                            System.out.println("Your balance is $0");
                            System.out.println(".........................");
                        }
                        break;
                    case "2":
                        System.out.println(".........................");
                        previousTrans = 0;
                        System.out.println("Type the amount to deposit.");
                        System.out.println("Deposited $" + setAmount());
                        System.out.println(".........................");
                        input2 = "2";
                        break;
                    case "3":
                        System.out.println(".........................");
                        previousTrans = 1;
                        System.out.println("Type the amount to withdraw");
                        System.out.println("Withdrew $" + setAmount());
                        System.out.println(".........................");
                        input2 = "3";
                        break;
                    case "4":
                        switch (previousTrans) {
                            case 0:
                                System.out.println(".........................");
                                System.out.println("Your previous transaction was depositing $" + setAmount());
                                System.out.println(".........................");
                                break;
                            case 1:
                                System.out.println(".........................");
                                System.out.println("Your previous transaction was withdrawing $" + setAmount());
                                System.out.println(".........................");
                                break;
                            default:
                                System.out.println("Error: Previous transaction not found");
                                break;
                        }
                        break;
                    case "5":
                        System.out.println("Exiting...");
                        looper = false;
                        break;
                    default:
                        System.out.println("Internal Error: if you're seeing this my code sucks");
                        looper = false;
                        break;
                }
            } else {
                System.out.println("Incorrect credentials. Try again or type 'exit' to finish.");
            }
        }
    }
    }