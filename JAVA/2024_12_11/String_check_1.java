//2.문자열에서 특정 문자 개수 구하기

package day241211_String;

public class String_check_1 {
    public static void main(String[] args) {
        String word = "hello";
        char c = 'l';

        System.out.println(solution(word,c));
    }

    public static int solution(String word, char c){
        char[] chacheck = word.toCharArray();
        int answer = 0;

        for(char element : chacheck){
            if(c == element){
                answer++;
            }
        }
        return answer;
    }
}
