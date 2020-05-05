package bankingapplication;

import java.util.Scanner;

class BankAccount{
    //declaration
    int balance ;
    short nn;
    int previousTransaction;
    String customerName;
    String customerId;
    
    //constructor for cName and cID 
    public BankAccount(String customerName , String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }
    
    //method for deposit
    void deposit(){
        int atm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance to deposit.");
        atm = sc.nextInt();
        if (atm > 0) {
            balance = balance + atm;
            nn = 1;
            previousTransaction = atm;
        }
    }
    //method for withdrawing
    void withdraw(){
        int atm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance to withdraw.");
        atm = sc.nextInt();
        if (balance >= atm) {
            balance -= atm;
            nn = 0;
            previousTransaction = atm;
        }
    }
    //method for previous transaction
    void prev(){
        if (nn == 1) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(nn == 0){
            System.out.println("Withdrawn: " + previousTransaction);
        }else{
            System.out.println("No transaction");
        }
    }
   
    //method for showing options and user
    void show(){
        String opt;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is: "+customerId);
        System.out.println("\n");
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Last transaction");
        System.out.println("E. Exit");
        
        do {
            System.out.println("=============================================");
            System.out.println("Enter an option");
            opt = sc.next();
            System.out.println("=============================================");
            
            switch(opt){
                case "A":
                    System.out.println("-------------------------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("-------------------------------------");
                    break;
                
                case "B":
                    System.out.println("-------------------------------------");
                    deposit();
                    break;
                    
                case "C":
                    System.out.println("-------------------------------------");
                    withdraw();
                    break;
                    
                case "D":
                    System.out.println("-------------------------------------");
                    prev();
                    break;
                            
                case "E":
                    System.out.println("*************************************");
                    break;
                    
                default:
                    System.out.println("Invalid option! Please enter again.");
                    break;
            }
        }
        while(!"E".equals(opt));
        {
                System.out.println("Thank You for using our services");
            }
    }
}
