package day241210_loop;

//1.범위 내 총합 구하기
public class Sum {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int answer = solution(start,end);
        System.out.println(answer);
    }

    public static int solution(int start, int end){
        int answer = 0;
        for(int i = start; i <= end; i++){
            answer += i;
        }
        return answer;
    }
}

