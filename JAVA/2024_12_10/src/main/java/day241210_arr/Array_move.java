//8.배열 위치 이동시키기

package day241210_arr;

import java.util.Arrays;

public class Array_move {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int direction = 3;
        int[] answer = solution(numbers,direction);

        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] numbers, int direction) {
        if(numbers.length <= 1){
            return numbers;
        }
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int index = (i + direction + numbers.length) % numbers.length;
            answer[index] = numbers[i];
        }
        return answer;
    }
}
