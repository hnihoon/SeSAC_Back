//7.문자열 자르기

package day241211_String;

public class String_chop {
    public static void main(String[] args) {
        String word = "algorithm";
        int start = 0;
        int end = 4;

        System.out.println(solution(word,start,end));
    }

    public static String solution(String word, int start, int end) {
        String answer = word.substring(start,(end+1));

        return answer;
    }
}
