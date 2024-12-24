package Page;

import Goods.Drink;
import Machine.DrinkMachine;
import User.User;

import java.util.Scanner;

public class UserPage {

    public static void cashStart(DrinkMachine dma,User user){
        Scanner sc = new Scanner(System.in);
        int cashTotal = 0;
        int chooseNum;
        boolean external = false;

        while(!external){
            int num = 1;
            System.out.println("현금을 투입해주세요!!");
            int putMoney = sc.nextInt();
            if(putMoney > user.getCashmoney()){
                System.out.println("잘못된 방법입니다.");
            } else {
                cashTotal += putMoney;
                System.out.println("현금투입 : " + putMoney);
            }
            System.out.println("현재 투입된 현금 : " + cashTotal);
            System.out.println();
            System.out.println("선택 가능한 음료수입니다.");
            for (Drink drink : dma.drinks) {
                if (cashTotal >= drink.getDrinkPrice()){
                    System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                }
            }

            System.out.println();
            System.out.println("1.재품을 구매하시겠습니까??");
            System.out.println("2.현금을 더 넣으시겠습니까??");
            chooseNum = sc.nextInt();
            if(chooseNum == 1) {
                for (Drink drink : dma.drinks) {
                    if (cashTotal >= drink.getDrinkPrice()){
                        System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                    }
                }
                System.out.println();
                System.out.println("구매하실 재품을 선택해주세요");
                chooseNum = sc.nextInt();
                System.out.println(dma.drinks.get(chooseNum + -1).getDrinkName() + " 구매가 완료되었습니다!!");
                cashTotal = cashTotal - dma.drinks.get(chooseNum + -1).getDrinkPrice();
                System.out.println();
                System.out.println("계속 이용하시겠습니까??");
                System.out.print("1.yes\t 2.no\n");
                chooseNum = sc.nextInt();
                if (chooseNum == 1){
                    continue;
                }
            }

            if (chooseNum == 2) {
                System.out.println("거스름돈 : " + cashTotal + "원 입니다.");
                user.setCashmoney(user.getCashmoney() + cashTotal);
                external = true;
            }
        }
    }

}
