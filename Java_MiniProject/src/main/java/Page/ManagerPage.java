package Page;

import Goods.Drink;
import Machine.DrinkMachine;

import java.util.Scanner;

public class ManagerPage {

    public static DrinkMachine start(DrinkMachine dma){
        boolean startInput = false;

        while (!startInput){
            System.out.println();
            System.out.println("환영합니다. 관리자님!! 무엇을 도와드릴까요??");
            boolean mainInput = false;
            while(!mainInput){
                System.out.println();
                System.out.println("사용 가능한 기능 \n1.추가\n2.수정\n3.조회\n4.삭제\n5.입고\n\n작업종료 : esc");
                Scanner sc = new Scanner(System.in);

                String mainswitchInput = sc.next();
                int num = 1;
                switch(mainswitchInput){
                    case "1":
                        System.out.println();
                            System.out.print("제품명, 금액을 순서대로 입력해주세요\t\t뒤로가기 : esc\n");
                            String drinkName = sc.next();
                            if (drinkName.equals("esc")){
                                break;
                            }
                            if (isAlpha(drinkName)) {
                                dma.setDrinks(new Drink(drinkName, sc.nextInt()));
                                System.out.println("제품이 추가되었습니다.");
                        }
                    break;

                    case "2":
                        System.out.println();
                        System.out.println("수정하실 제품을 선택해주세요\t\t뒤로가기 : esc");
                        for (Drink drink : dma.drinks) {
                            System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                            num++;
                        }
                        String changeNum = sc.next();
                        if (changeNum.equals("esc")){
                            break;
                        }

                        System.out.print("제품명을 변경하시겠습니까??\t\t뒤로가기 : esc\n1.yes\n2.no\n");
                        String changeCheckNum = sc.next();

                        switch(changeCheckNum){
                            case "1":
                                System.out.print("변경하실 제품명을 작성해주세요 : ");
                                dma.drinks.get(Integer.parseInt(changeNum)-1).setDrinkName(sc.next());
                            break;

                            case "esc","2":
                                break;
                        }
                        System.out.print("제품 가격을 변경하시겠습니까??\t\t뒤로가기 : esc\n1.yes\n2.no\n");
                        changeCheckNum = sc.next();

                        switch(changeCheckNum){
                            case "1":
                                System.out.print("변경하실 금액을 작성해주세요 : ");
                                dma.drinks.get(Integer.parseInt(changeNum)-1).setDrinkPrice(sc.nextInt());
                                break;

                            case "esc","2":
                                break;
                        }
                        System.out.println("제품 정보가 변경되었습니다.");
                        System.out.println();
                    break;

                    case "3":
                        boolean valueInput_3 = true;
                        while (valueInput_3){
                            for (Drink drink : dma.drinks) {
                                System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                                num++;
                            }
                            System.out.println();
                            System.out.println("뒤로가기 : esc");
                            if(sc.next().equals("esc")){
                                System.out.println();
                                break;
                            } else {
                                System.out.print("잘못 입력하셨습니다.");
                                num = 1;
                            }
                        }
                        break;
                    case "4":
                        System.out.println();
                        System.out.println("삭제하실 제품을 선택해주세요\t\t뒤로가기 : esc");
                        for (Drink drink : dma.drinks) {
                            System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                            num++;
                        }
                        String deleteNum = sc.next();
                        if (deleteNum.equals("esc")){
                            break;
                        }
                        dma.drinks.remove(Integer.parseInt(deleteNum)-1);
                        System.out.println("삭제가 완료되었습니다.");
                    break;

                    case "5":
                        System.out.println();
                        System.out.println("입고하실 제품을 선택해주세요\t\t뒤로가기 : esc");

                        for (Drink drink : dma.drinks) {
                            System.out.println(num +"." + drink.getDrinkName() + " (제고 : " + drink.getDrinkQuantity() + ")");
                            num++;
                        }
                        String storeNum = sc.next();
                        if (storeNum.equals("esc")){
                            break;
                        }
                        System.out.println();
                        System.out.println("입고하실 수량을 작성해주세요");
                        dma.drinks.get(Integer.parseInt(storeNum)-1).setDrinkQuantity(sc.nextInt());
                        System.out.println("입고가 완료되었습니다.");
                        System.out.println();
                    break;

                    case "esc":
                        startInput = true;
                        mainInput = true;
                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다.");
                }
            }
        }
    return dma;
}
    public static boolean isAlpha(String str) {
        return str != null && str.matches("[a-zA-Z가-힣]+");
    }
}

