package day241210_loop;

//3.소수 구하기
public class Primenum {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int answer = solution(start,end);
        System.out.println(answer);
    }
    public static int solution(int start, int end) {
        int counts = 0;

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                counts += 1;
            }
        }
        return counts;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
