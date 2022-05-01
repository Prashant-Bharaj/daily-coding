package hackerrank.synchronization_example;

public class User {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.topUp(100);

        Thread th1 = new Thread(() -> {
           ATM.withDraw(bankAccount, 100);
        });
        Thread th2 = new Thread(()-> {
           ATM.withDraw(bankAccount, 100);
        });
        th1.start();
        th2.start();
    }
}
