package day241212_class;

public class class_triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.length(5, 5, 5);

        triangle.area(10, 8);
    }
}

class Triangle {
    int length = 0; // 둘레 저장 변수
    double area = 0; // 넓이 저장 변수

    //1)둘레 계산 메서드
    public void length(int a, int b, int c) {
        this.length = a + b + c;
        System.out.println("length: " + this.length);
    }

    //2)넓이 계산 메서드
    public void area(int base, int height) {
        this.area = 0.5 * base * height; // 넓이 계산
        System.out.println("area: " + this.area);
    }
}

