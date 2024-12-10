package day241210_loop;

//6.자릿수 합 구하기
public class Digits_sum {
    public static void main(String[] args) {
        int num = 12345;
        int answer = solution(num);
        System.out.println(answer);
    }

    public static int solution(int num){
        String numstr = Integer.toString(num);
        int answer = 0;
        for(int i = 0; i < numstr.length(); i++){
            String sum[] = numstr.split("");
            answer += Integer.parseInt(sum[i]);
        }
        return answer;
    }
}
