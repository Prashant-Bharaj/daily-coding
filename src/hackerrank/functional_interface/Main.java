package hackerrank.functional_interface;



// one way to use functional Interface
/*
public class Main implements Managerial{
    @Override
    public void displayName(String name){
        System.out.println("Manager "+ name);
    }
    public static void main(String[] args){
        new Main().displayName("Prashant");
    }
}
*/

public class Main{
    public static void main(String[] args){
        // creating anonymous class and overriding the abstract method
        Managerial mg = new Managerial(){
            @Override
            public void displayName(String name){
                System.out.println("Manager "+name);
            }
        };
        mg.displayName("Prashant Singh");

        // using Lambda function
        Managerial ks = name -> System.out.println("Manager "+name);
        ks.displayName("Prashant");
    }
}
