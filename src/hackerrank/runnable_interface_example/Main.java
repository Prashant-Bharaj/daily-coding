package hackerrank.runnable_interface_example;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new RunnableInterfaceExample());
        th1.start();
        Thread th2 = new Thread(new RunnableInterfaceExample());
        th2.start();
        Thread th3 = new Thread(new RunnableInterfaceExample());
        th3.start();

    }
}
