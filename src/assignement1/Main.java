package assignement1;

abstract class Figure {
    double dim1;

    abstract void findArea();

    abstract void findPerimeter();
}

class Circle extends Figure {
    Circle(int dim1) {
        this.dim1 = dim1;
    }

    @Override
    void findArea() {
        System.out.println("Area of circle is " + 4.0 * Math.atan(1.0) * dim1 * dim1);
    }

    @Override
    void findPerimeter() {
        System.out.println("Perimeter of circle is " + 2 * 4.0 * Math.atan(1.0) * dim1);
    }

    public String toString() {

        return "Area of circle is " + 4.0 * Math.atan(1.0) * dim1 * dim1 + "\n" + "Perimeter of circle is " + 2 * 4.0 * Math.atan(1.0) * dim1;
    }
}

class Rectangle extends Figure {
    double dim2;

    Rectangle(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    void findArea() {
        System.out.println("Area of Rectangle is " + dim1 * dim2);
    }

    @Override
    void findPerimeter() {
        System.out.println("Perimeter of Rectangle is " + 2 * (dim1 + dim2));
    }

    public String toString() {
        return "Area of Rectangle is " + dim1 * dim2 + "\n" + "Perimeter of Rectangle is " + 2 * (dim1 + dim2);
    }
}

class Triangle extends Figure {
    double dim2, dim3;

    Triangle(int dim1, int dim2, int dim3) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }

    @Override
    void findArea() {
        double semi = (dim1 + dim2 + dim3) / 2;
        double area = Math.sqrt(semi * (semi - dim1) * (semi - dim2) * (semi - dim3));
        System.out.println("Area of Triangle is " + area);
    }

    @Override
    void findPerimeter() {
        System.out.println("Perimeter of the triangle is " + (dim1 + dim2 + dim3));
    }

    public String toString() {
        double semi = (dim1 + dim2 + dim3) / 2;
        double area = Math.sqrt(semi * (semi - dim1) * (semi - dim2) * (semi - dim3));
        return "Area of Triangle is " + area + "\n" + "Perimeter of the triangle is " + (dim1 + dim2 + dim3);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 5);
        Triangle t = new Triangle(2, 3, 4);
        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
    }
}