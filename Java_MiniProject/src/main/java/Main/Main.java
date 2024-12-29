package Main;

import Machine.DrinkMachine;
import Page.ManagerPage;
import Page.UserPage;
import User.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User kim = new User();
        DrinkMachine dma = new DrinkMachine();
        kim.setCashmoney(5000);
        kim.setCardmoney(2000);

        boolean mainInput = false;

        while(!mainInput) {
            System.out.println("결제방식을 선택해주세요!!\n1.현금\n2.카드");

            switch(sc.nextInt()){
                case 1: // 현금구매
                    UserPage.cashStart(dma,kim);
                    break;
                case 2: // 카드구매
                    UserPage.cardStart(dma,kim);
                    break;
                case 1234: // 관리자모드
                    dma = ManagerPage.start(dma);
                    break;
                case 10: // 작업종료
                    mainInput = true;
                    break;
            }
                    System.out.println("현금 잔액 : " + kim.getCashmoney());
                    System.out.println("카드 잔액 : " + kim.getCardmoney());
                    System.out.println();
        }
    }
}
