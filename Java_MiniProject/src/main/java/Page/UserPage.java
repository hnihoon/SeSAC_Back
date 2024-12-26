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
        int DrinkQuantity = 0;

        while(!external){
            int num = 1;
            System.out.println();
            System.out.println("현금을 투입해주세요!!");
            int putMoney = sc.nextInt();
            if(putMoney > user.getCashmoney()){
                System.out.println("잘못된 방법입니다.");
            } else {
                cashTotal += putMoney;
                System.out.println("현금투입 : " + putMoney);
                user.setCashmoney(user.getCashmoney() - putMoney);
            }
            System.out.println("현재 투입된 현금 : " + cashTotal);
            System.out.println();
            for (Drink drink : dma.drinks) {
                DrinkQuantity += drink.getDrinkQuantity();
            }
            if (DrinkQuantity <= 0){
                System.out.println("모든 음료가 소진되었습니다.");
                System.out.println();
                System.out.println("거스름돈 : " + cashTotal + "원 입니다.\n감사합니다.");
                user.setCashmoney(user.getCashmoney() + cashTotal);
                System.out.println();
                break;
            }

            System.out.println("선택 가능한 음료수입니다.");
            for (Drink drink : dma.drinks) {
                DrinkQuantity += drink.getDrinkQuantity();
                if (cashTotal >= drink.getDrinkPrice()){
                    System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                }
            }

            System.out.println();
            System.out.println("1.재품을 구매하시겠습니까??");
            System.out.println("2.현금을 더 넣으시겠습니까??");
            System.out.println("3.구매를 취소하시겠습니까??");
            chooseNum = sc.nextInt();
            System.out.println();
            if(chooseNum == 1) {
                for (Drink drink : dma.drinks) {
                    if (cashTotal >= drink.getDrinkPrice()) {
                        System.out.println(num + "." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                    }
                }
            } else if(chooseNum == 2){
                continue;
            } else {
                System.out.println("거스름돈 : " + cashTotal + "원 입니다.\n감사합니다.");
                user.setCashmoney(user.getCashmoney() + cashTotal);
                external = true;
                System.out.println();
                break;
            }
                System.out.println();
                System.out.println("구매하실 재품을 선택해주세요");
                chooseNum = sc.nextInt();

                Drink getDrink = dma.drinks.get(chooseNum + -1);

                System.out.println();
                System.out.println(getDrink.getDrinkName() + " 구매가 완료되었습니다!!");
                getDrink.setDrinkQuantity(getDrink.getDrinkQuantity() - 1);
                cashTotal = cashTotal - dma.drinks.get(chooseNum + -1).getDrinkPrice();
                System.out.println();
                System.out.println("계속 이용하시겠습니까??");
                System.out.print("1.yes\t 2.no\n");
                chooseNum = sc.nextInt();
                if (chooseNum == 1){
                    continue;
                }

            if (chooseNum == 2) {
                System.out.println("거스름돈 : " + cashTotal + "원 입니다.\n감사합니다.\n");
                user.setCashmoney(user.getCashmoney() + cashTotal);
                external = true;
            }
        }
    }

    public static void cardStart(DrinkMachine dma, User user){
        Scanner sc = new Scanner(System.in);
        int DrinkQuantity = 0;
        boolean cardInput = false;
        int num;

        System.out.println();
        System.out.println("카드를 선택하셨습니다.");
        System.out.println();

        while (!cardInput){
            num = 1;
        for (Drink drink : dma.drinks) {
            DrinkQuantity += drink.getDrinkQuantity();
        }

        if (DrinkQuantity <= 0){
            System.out.println("모든 음료가 소진되었습니다.");
            System.out.println();
            break;
        }

        System.out.println("선택 가능한 음료수입니다.");

        for (Drink drink : dma.drinks) {
            if (drink.getDrinkQuantity() > 0){
                System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                num++;
            }
        }

        int cardNum = sc.nextInt();
        Drink getDrink = dma.drinks.get(cardNum + -1);
        System.out.println();
        System.out.println(getDrink.getDrinkName() + "의 가격은 " + getDrink.getDrinkPrice() + "원 입니다.");
        System.out.println("구매 하시겠습니까??");
        System.out.print("1.yes\t 2.no\n");
        cardNum = sc.nextInt();

        System.out.println();
        if (cardNum == 1){
            System.out.println(getDrink.getDrinkName() + " 구매가 완료되었습니다!!");
            getDrink.setDrinkQuantity(getDrink.getDrinkQuantity() - 1);
            user.setCardmoney(user.getCardmoney() - getDrink.getDrinkPrice());
            System.out.println();
            System.out.println("계속 이용하시겠습니까??");
            System.out.print("1.yes\t 2.no\n");
            cardNum = sc.nextInt();
        }
            System.out.println();
        if (cardNum == 1){
            continue;
        } else {
            break;
        }
        }

    }

}
