package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list = new ArrayList<>(List.of(3,1,2,2,4));
        System.out.println(list);

        List<Integer> over1List = list.stream() // list를 stream으로 변경
                .filter(x -> x > 1) // filter 적용
                .collect(Collectors.toList());// List로 변경

        System.out.println(over1List);
    }
}
