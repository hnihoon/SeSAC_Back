//11.배열 자르기

package day241210_arr;

import java.util.Arrays;

public class Array_chop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int start = 2;
        int end = 3;
        int[] answer = solution(numbers,start,end);

        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] numbers, int start, int end) {
        int[] answer = Arrays.copyOfRange(numbers,start,end+1);

        return answer;


    }
}
