package day241210_loop;

//5.자릿수 구하기
public class Digits {
    public static void main(String[] args) {
        int num = 12345;
        int answer = solution(num);
        System.out.println(answer);
    }
    
    public static int solution(int num){
        String numstr = Integer.toString(num);
        return numstr.length();
    }
    
}
