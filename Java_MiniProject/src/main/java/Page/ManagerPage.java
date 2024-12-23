package Page;

import Goods.Drink;
import Machine.DrinkMachine;

import java.util.Scanner;

public class ManagerPage {

    public static void start(){
        DrinkMachine dma = new DrinkMachine();
        System.out.println("환영합니다. 관리자님!! 무엇을 도와드릴까요??");
        boolean mainInput = false;
        while(!mainInput){
        System.out.println("사용 가능한 기능 \n1.추가\n2.수정\n3.조회\n4.삭제\n5.입고");
        Scanner sc = new Scanner(System.in);
        int num = 1;

        switch(sc.nextInt()){
            case 1:
                boolean isValidInput = false;
                while (!isValidInput) { // 유효한 입력이 들어올 때까지 반복
                    System.out.println("제품명, 금액을 입력해주세요:");
                    String drinkName = sc.next();

                    if (isAlpha(drinkName)) {
                        dma.setDrinks(new Drink(drinkName, sc.nextInt()));
                        System.out.println("제품이 추가되었습니다.");
                        isValidInput = true; // 올바른 입력이면 반복 종료
                        System.out.println("다른작업을 추가로 진행하시겠습니까?\n1.yes\n2.no");
                        if(sc.nextInt() == 2){
                            mainInput = true;
                        }
                        System.out.println();
                    } else {
                        System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
                    }
                }
            break;
            case 2:
                System.out.println();
                System.out.println("수정하실 제품을 선택해주세요");
                for (Drink drink : dma.drinks) {
                    System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                    num++;
                }
                int changeNum = sc.nextInt();

                System.out.println("제품명을 변경하시겠습니까??\n1.yes\n2.no");
                int changeCheckNum = sc.nextInt();

                if(changeCheckNum == 1){
                    dma.drinks.get(changeNum-1).setDrinkName(sc.next());
                    changeNum = 0;
                }
                System.out.println("제품 가격을 변경하시겠습니까??\n1.yes\n2.no");
                changeCheckNum = sc.nextInt();

                if(changeCheckNum == 1){
                    dma.drinks.get(changeNum).setDrinkPrice(sc.nextInt());
                }
                System.out.println("제품 정보가 변경되었습니다.");
                System.out.println();
            break;

            case 3:
                System.out.println();
                boolean lookUpInput = false;
                while (!lookUpInput){
                for (Drink drink : dma.drinks) {
                    System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                    num++;
                    }
                    System.out.println();
                    System.out.println("뒤로가기 : esc");
                    if(sc.next().equals("esc")){
                        lookUpInput = true;
                        System.out.println();
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println();
                    }
                }
            break;

            case 4:
                System.out.println();
                System.out.println("삭제하실 제품을 선택해주세요");
                for (Drink drink : dma.drinks) {
                    System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                    num++;
                }
                int deleteNum = sc.nextInt();
                dma.drinks.remove(deleteNum-1);
                System.out.println("삭제가 완료되었습니다.");
            break;

            case 5:
                System.out.println();
                System.out.println("입고하실 제품을 선택해주세요");
                for (Drink drink : dma.drinks) {
                    System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                    num++;
                }
                int storeNum = sc.nextInt();
                System.out.println();
                System.out.println("입고하실 수량을 작성해주세요");
                dma.drinks.get(storeNum-1).setDrinkQuantity(sc.nextInt());
                System.out.println("입고가 완료되었습니다.");
            break;
        }
    }

}
    public static boolean isAlpha(String str) {
        return str != null && str.matches("[a-zA-Z가-힣]+");
    }
}

