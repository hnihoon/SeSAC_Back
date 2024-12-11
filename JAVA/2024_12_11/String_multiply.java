//6.문자열 곱하기

package day241211_String;

public class String_multiply {
    public static void main(String[] args) {
        String word = "abc";
        int n = 3;

        System.out.println(solution(word, n));

    }

    public static String solution(String word, int n) {
        String answer = "";

        for(int i = 0; i < n; i++){
            answer += word;
        }
        return answer;
    }
}
