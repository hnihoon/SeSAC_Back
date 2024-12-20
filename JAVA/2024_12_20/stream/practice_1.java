package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice_1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //1.짝수만 필터링하여 리스트 반환
        List<Integer> evenNum = numbers.stream().filter(x -> x % 2 == 0).toList();

        System.out.println(evenNum);

        //2.모든 숫자에 2를 곱하여 리스트 반환
        List<Integer> multNum = numbers.stream().map(x -> x * 2).toList();

        System.out.println(multNum);

        //3.숫자들의 합계 계산
        IntStream intStream = IntStream.range(numbers.getFirst(), numbers.getLast()+1);

        System.out.println(intStream.sum());

        //4. 5보다 큰 숫자의 개수 계산
        List<Integer> filterNum = numbers.stream().filter(x -> x > 5).toList();

        System.out.println(filterNum.size());
    }
}
