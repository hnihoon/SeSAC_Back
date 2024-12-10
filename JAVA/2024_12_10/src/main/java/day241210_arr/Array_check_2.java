//3.배열의 소수의 개수 구하기

package day241210_arr;

public class Array_check_2 {
    public static void main(String[] args) {
        int[] numbers = {21,47,33,51,60,99};

        System.out.println(solution(numbers));

    }

    public static int solution(int[] numbers) {
        int answer = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 2) {
                answer++;
            } else if(!(numbers[i] % 2 == 0)){
                answer++;
            }

        }
    return answer;
    }
}
