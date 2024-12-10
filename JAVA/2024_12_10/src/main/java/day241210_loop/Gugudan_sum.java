package day241210_loop;

//7.구구단 합 구하기
public class Gugudan_sum {
    public static void main(String[] args) {
        int start = 4;
        int end = 5;
        int answer = solution(start,end);
        System.out.println(answer);
    }

    public static int solution(int start, int end) {
        int answer = 0;
        for(int i = start; i <= end; i++){
            for(int j = 1; j <= 9; j++){
                answer += i * j;
            }
         }
        return answer;
    }
}
