package day241210_loop;

//3.범위 내 배수의 합 구하기
public class Multiple_sum {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        int num = 3;
        int answer = solution(start,end,num);
        System.out.println(answer);
    }

    public static int solution(int start, int end, int num) {
        int answer = 0;
        for(int i = start; i <= end; i++){
            if(i % 3 == 0){
                answer += i;
            }
        }
        return answer;
    }
}
