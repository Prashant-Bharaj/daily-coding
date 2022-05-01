package hackerrank.synchronization_example;

public class ATM {
    static synchronized void withDraw(BankAccount bankAccount, int amount){
        int balance = bankAccount.getBalance();
        if((balance - amount) < 0){
            System.out.println("Permission Denied");
        }else{
            bankAccount.debit(balance);
            System.out.println("$ " +amount +" successfully withdrawal");
        }
        System.out.println("current balance is "+balance);
    }
}
