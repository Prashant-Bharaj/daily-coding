package hackerrank.thread_class_example;

public class ThreadClassExample extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(i < 100){
            System.out.println(Thread.currentThread().getName()+" "+i);
            i++;
        }
    }
    public static void main(String[] args){
        ThreadClassExample th1 = new ThreadClassExample();
        th1.setName("first thread");
        // jvm calls the run method
        th1.start();

        ThreadClassExample th2 = new ThreadClassExample() {
            @Override
            public void run(){
                int i = 100;
                while(i < 200){
                    System.out.println(Thread.currentThread().getName()+" "+ i);
                    i++;
                }
            }
        };
        th2.setName("second thread");
        th2.start();
    }
}
