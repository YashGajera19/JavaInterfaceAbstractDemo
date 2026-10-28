abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Calculating area");
    }
}

class Rectangle extends Shape {
    double length = 5;
    double breadth = 3;

    double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.display();
        System.out.println("Area = " + s.area());
    }
}
