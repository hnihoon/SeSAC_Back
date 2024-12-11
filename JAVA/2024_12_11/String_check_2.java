//3.문자열에서 모음 개수 세기

package day241211_String;

//방법1
//public class String_check_2 {
//    public static void main(String[] args) {
//        String word = "hello";
//
//        System.out.println(solution(word));
//    }
//
//    public static int solution(String word){
//        char[] wordchararr = word.toCharArray();
//        char[] checkarr = {'a','e','i','o','u','w','r'};
//        int answer = 0;
//
//        for(int i=0; i < checkarr.length; i++){
//            for(int j=0; j < wordchararr.length; j++) {
//                if(wordchararr[j] == checkarr[i]){
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }
//}

//방법2
public class String_check_2 {
    public static void main(String[] args) {
        String word = "hello";

        System.out.println(solution(word));
    }

    public static int solution(String word){
        int answer = 0;
        String[] checkarr = {"a","e","i","o","u","w","r"};

        for(int i = 0; i < checkarr.length; i++){
            if(word.contains(checkarr[i])){
                answer++;
            }
        }
        return answer;

    }
}
