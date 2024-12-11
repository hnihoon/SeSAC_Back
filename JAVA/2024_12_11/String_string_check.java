//12.문자열 부분 문자열 개수 세기

package day241211_String;

public class String_string_check {
    public static void main(String[] args) {
        String word = "ababab";
        String target = "aba";

        System.out.println(solution(word,target));
    }

    public static int solution(String word, String target) {
        int answer = 0;
        char[] wordcharr = word.toCharArray();
        String check = "";

        for(int i = 0; i < wordcharr.length; i++) {
            check = "";
            for(int j = 0; j < word.length() - i; j++){
                check += wordcharr[j+i];
                if(check.equals(target)){
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
