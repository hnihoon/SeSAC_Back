package test;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle();

        System.out.println(rectangle.calcuateArea());

        Shape triangle = new Triangle();
        System.out.println(triangle.calcuateArea());
    }
}
