//11.팰린드룸 판별하기

package day241211_String;

public class String_palindrome {
    public static void main(String[] args) {
        String word = "level";

        StringBuffer strbuff = new StringBuffer(word);

        System.out.println(strbuff.toString().equals(strbuff.reverse().toString()));
    }

}
