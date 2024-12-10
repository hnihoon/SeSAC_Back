//2.배열의 특정 원소 개수 구하기

package day241210_arr;

public class Array_check_1 {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = {5,5,5,5,5,5,5};

        System.out.println(solution(n,numbers));

    }

    public static int solution(int n, int[] numbers) {
        int answer = 0;

        for(int element : numbers){
            if(n == element){
                answer++;
            }
        }
        return answer;
    }
}
