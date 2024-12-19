package test;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //추가1
        list.add(1);
        list.add(2);

        System.out.println("추가1에 대한 내용 출력 : " + list);
        System.out.println();

        //추가2
        list.add(1,100);

        System.out.println("추가2에 대한 내용 출력 : " + list);
        System.out.println();

        //접근
        System.out.println("접근 결과 : " + list.get(1));
        System.out.println();

        //수정
        list.set(1, 1000);
        System.out.println("수정 결과 : " + list);
        System.out.println();

        //list 길이
        System.out.println("list 길어 : " + list.size());
        System.out.println("===============================================");

        java.util.List<String> strlist = new ArrayList<>();

        strlist.add("1");
        System.out.println(strlist);





    }
}
