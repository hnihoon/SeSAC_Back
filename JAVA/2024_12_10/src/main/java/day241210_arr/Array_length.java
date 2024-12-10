//1.배열의 길이 구하기

package day241210_arr;

public class Array_length {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int answer = numbers.length;
        return answer;
    }
}

