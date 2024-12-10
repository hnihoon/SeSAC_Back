//7.특정 구간을 건너뛰어 원소 구하기

package day241210_arr;

import java.util.Arrays;

public class Array_skip {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int step = 1;
        int[] answer = solution(numbers,step);

        System.out.println(Arrays.toString(answer));

    }

    public static int[] solution(int[] numbers, int step) {
        int arr_count = 0;
        int check_count = 0;

        for(int i =0; i < numbers.length; i += step){
            arr_count++;
        }

        int[] answer = new int[arr_count];
        for(int i =0; i < numbers.length; i += step){
            answer[check_count] = numbers[i];
            check_count++;
        }

        return answer;
    }

}
