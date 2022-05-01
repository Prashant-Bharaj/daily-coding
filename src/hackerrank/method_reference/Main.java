package hackerrank.method_reference;

public class Main {
    public static void main(String[] args){
        Square s = new Square(4);

        //
        Shapes shapes = (Square square) -> {
          return square.area();
        };

        // method reference
        Shapes sp = Square::area;

        System.out.println(sp.getArea(s));
        System.out.println(shapes.getArea(s));
    }
}
