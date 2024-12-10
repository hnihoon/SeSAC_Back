//4.배열의 최소값 구하기

package day241210_arr;

import java.util.Arrays;

public class Array_min {
    public static void main(String[] args) {
        int[] numbers = {500,499,498,497};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int min = numbers[0];
        for(int element : numbers){
            if(element < min){
                min = element;
            }
        }
        return min;
    }
}
