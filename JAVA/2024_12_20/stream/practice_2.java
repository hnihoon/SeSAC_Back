package test;

import java.util.Arrays;
import java.util.List;

public class practice_2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "fineapple", "apple");

        //1.길이가 5이상인 단어들만 필터링하여 리스트 반환
        List<String> conditionList = words.stream().filter(x -> x.length() >= 5).toList();

        System.out.println(conditionList);

        //2.모든 단어들을 대문자로 변환하여 리스트 반환
        List<String> uppterList = words.stream().map(String::toUpperCase).toList();

        System.out.println(uppterList);

        //3.중복된 단어 제거하고 알파뱃 순 정렬아혀 리스트 반환
        List<String> disList = words.stream().distinct().toList();

        System.out.println(disList);

        //4.각 단어의 길이를 리스트로 변환
        List<Integer> sizeList = words.stream().map(String::length).toList();

        System.out.println(sizeList);
    }
}
