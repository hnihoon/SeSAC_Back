//12.배열 뒤집기

package day241210_arr;

import java.util.Arrays;

public class Array_reverse {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int[] answer = solution(numbers);

        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] numbers) {
        int index = numbers.length-1;
        int[] answer = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[index-i];
        }
        return answer;
    }
}
