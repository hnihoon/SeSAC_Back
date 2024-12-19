package test;

import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //추가
        map.put("korean", 100);
        map.put("english", 10);
        System.out.println("추가 결과 : " + map);

        //값 수정 : 덮어쓰기
        map.put("korean", 30);
        System.out.println("수정 결과 : " + map);

        //조회
        System.out.println("있는 값 조회 : " + map.get("korean"));
        System.out.println("없는 값 조회 : " + map.get("math"));

        //값이 없는 경우 임의의 값 넣기
        System.out.println("값이 없는 경우 기본값 설정 : " + map.getOrDefault("math", 0));

        //크기
        System.out.println("크기 조회 : " + map.size());

        Set<String> keys = map.keySet(); //ctrl + alt + v 자동완성

        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + value);
        }

    }
}
