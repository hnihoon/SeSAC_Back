//4.문자열 포매팅을 활용해서 출력해보기

package day241211_String;

public class String_fomating {
    public static void main(String[] args) {
        //방법1
        String word = "hello";

//        System.out.printf("%s is %o", word , word.length());

        //방법2
        String word2 = "hello";
        int length = word2.length();
        String sum = "%s is %o";

        System.out.printf(sum, word2, length);
    }
}
