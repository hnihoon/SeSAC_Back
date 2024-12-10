//10.배열 곱하기

package day241210_arr;

import java.util.Arrays;

public class Array_multiply {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int n = 3;
        int[] answer = solution(numbers,n);

        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] numbers, int n) {
        int[] answer = new int[numbers.length * n];

        for(int i = 0; i < answer.length; i++){
            if(i < numbers.length){
                answer[i] = numbers[i];
            } else{
                answer[i] = numbers[i % numbers.length];
            }
        }
        return answer;
    }
}
