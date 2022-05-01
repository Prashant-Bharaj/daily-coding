package hackerrank.synchronization_example;

public class BankAccount {
    private int balance = 0;


    void topUp(int amount){
        balance += amount;
    }
    void debit(int amount){
        balance -= amount;
    }

    int getBalance(){
        return balance;
    }


}
