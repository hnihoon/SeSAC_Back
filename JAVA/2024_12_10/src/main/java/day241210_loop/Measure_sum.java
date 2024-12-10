package day241210_loop;

//8.약수의 합 구하기
public class Measure_sum {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(solution(num));
    }

    public static int solution(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
        }
        return sum;
    }
}
