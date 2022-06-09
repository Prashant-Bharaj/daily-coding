public class Main extends A implements B {

    public static void main(String args[]){
    
    System.out.print("Testing ");
    
    Main newMain = new Main();
    
    newMain.methodOne();
    
    newMain.methodTwo();
    
    }
    
    @Override
    
    public void methodTwo() {
    
    System.out.print("Method Three Interface ");
    
    
    }
    
    }
    
    
    class A {
    
    public void methodOne(){
    
    System.out.print("Method Two ");
    
    }
    
    public void methodTwo(){
    
    System.out.print("Method Three Inheritance ");
    
    }
    
    }
    
    interface B {
    
    void methodTwo();
    
    }