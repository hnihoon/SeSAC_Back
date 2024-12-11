//9.문자열 수정하기

package day241211_String;

public class String_modify {
    public static void main(String[] args) {
        String word = "hello world";
        String oldString = "world";
        String newString = "python";

        System.out.println(word); // 변경 전
        System.out.println(word.replace(oldString,newString)); //변경 후
    }
}
