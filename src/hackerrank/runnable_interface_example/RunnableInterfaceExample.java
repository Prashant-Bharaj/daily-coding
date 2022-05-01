package hackerrank.runnable_interface_example;

public class RunnableInterfaceExample implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while(i < 8){
            System.out.println(i+" "+ Thread.currentThread().getName());
            i++;
        }
    }
}
