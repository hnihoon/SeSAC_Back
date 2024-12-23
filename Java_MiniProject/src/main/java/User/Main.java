package User;

import Goods.Drink;
import Machine.DrinkMachine;
import Page.ManagerPage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mainInput = false;
        while(!mainInput){
        System.out.println("결제방식을 선택해주세요!!\n1.현금\n2.카드");

        switch(sc.nextInt()){
            case 1:
                System.out.println("현금을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("카드를 석택하셨습니다.");
                break;
            case 1234:
                ManagerPage.start();
                break;
            case 10:
                mainInput = true;
                break;
        }


        }
    }
}
