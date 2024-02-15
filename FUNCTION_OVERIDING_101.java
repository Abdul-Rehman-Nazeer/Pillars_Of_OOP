class Rectangle {
    int l, w;

    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (l * w));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (l + w)));
    }
}

class Square extends Rectangle {
    int s;

    Square(int s) {
        super(s, s);
        this.s = s;
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Square: " + (4 * s));
    }
}

public class FUNCTION_OVERIDING_101 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 6);
        System.out.println("Rectangle:");
        rectangle.area();
        rectangle.perimeter();
        System.out.println();

        Square square = new Square(5);
        System.out.println("Square:");
        square.area();
        square.perimeter();
    }
}
