//9.배열 합치기

package day241210_arr;

import java.util.Arrays;

public class Array_combine {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {4,5,6};
        int[] answer = solution(numbers1,numbers2);

        System.out.println(Arrays.toString(answer));

    }

    public static int[] solution(int[] numbers1, int[] numbers2) {
        int index = numbers1.length + numbers2.length;
        int[] answer = new int[index];

        for(int i = 0; i < index; i++) {
            if(i < numbers1.length){
                answer[i] = numbers1[i];
            } else {
                answer[i] = numbers2[i-numbers1.length];
            }
        }
        return answer;
        }
    }
