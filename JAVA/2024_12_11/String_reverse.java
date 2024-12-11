//8.문자열 뒤집기

package day241211_String;

public class String_reverse {
    public static void main(String[] args) {
        String word = "hello";

        System.out.println(solution(word));
    }

    public static String solution(String word) {
        StringBuffer strrverse = new StringBuffer(word);
        strrverse.reverse();

        String answer = strrverse.toString();

        return answer;
    }
}