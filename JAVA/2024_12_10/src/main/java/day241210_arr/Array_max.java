//5.배열의 최대값 구하기

package day241210_arr;

public class Array_max {
    public static void main(String[] args) {
        int[] numbers = {500,499,498,497};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int max = numbers[0];
        for(int element : numbers){
            if(element > max){
                max = element;
            }
        }
        return max;
    }
}
