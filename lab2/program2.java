package lab2;

class BankAccount{
    static int no_of_acc;
    static{
        no_of_acc = 0;
    }
    BankAccount(){
        System.out.println("Account created successfully!");
        no_of_acc++;
    }
    static void fetchAccounts(){
        System.out.println("The total number of accounts is: "+no_of_acc);
    }
}

public class program2 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount.fetchAccounts();
    }
}
