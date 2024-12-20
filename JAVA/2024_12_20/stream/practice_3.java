package test;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.IntStream;

public class practice_3 {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("notebook", 1200000, "SALE"),
                new Product("mouse", 50000, "SALE"),
                new Product("keyboard", 150000, "SOLD_OUT"),
                new Product("monitor", 350000, "SOLD_OUT"),
                new Product("speaker", 400000, "SALE")
        );

        //1.상품들의 이름 리스트 반환
        List<String> forst = products.stream().map(x -> x.getName()).toList();

        System.out.println(forst);

        //2.20만원 이상인 상품들의 이름 리스트 반환
        List<String> expensiveProductsName = products.stream()
                .filter(p -> p.getPrice() >= 200000)
                .map(Product::getName)
                .toList();

        System.out.println(expensiveProductsName);

        //3.판매중인 상품의 가격 합
        int totalPrice = products.stream()
                .filter(p -> p.getStatus().equals("SALE"))
                .mapToInt(Product::getPrice)
                .sum();

        System.out.println(totalPrice);

        //4.판매중이면서 20만원 이상인 상품들의 이름 리스트 반환
        List<String> onSaleName = products.stream().
                filter(p -> p.getStatus().equals("SALE") && p.getPrice() > 200000).
                map(Product::getName).toList();

        System.out.println(onSaleName);
    }
}
