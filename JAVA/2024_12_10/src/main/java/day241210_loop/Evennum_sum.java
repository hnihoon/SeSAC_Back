package day241210_loop;

//2.범위 내 짝수의 합 구하기
public class Evennum_sum {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int answer = solution(start,end);

        System.out.println(answer);
    }

    public static int solution(int start, int end) {
        int answer = 0;
        for(int i = start; i <= end; i++){
            if(i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}

