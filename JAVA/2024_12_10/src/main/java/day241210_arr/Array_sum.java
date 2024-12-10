//6.배열의 총합 구하기

package day241210_arr;

public class Array_sum {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

        System.out.println(solution((numbers)));
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        for(int element : numbers){
            answer += element;
        }
        return answer;
    }
}
