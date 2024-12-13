//접근 제어자 실습

package modifierprac;

public class Main {
    public static void main(String[] args) {
//      1.학생을 만들고 정보를 입력해보기

        Person kim = new Person();

        kim.setName("kim");
        kim.age = 30;
        kim.height = 160;
        kim.RunGet();
        kim.Walk();
        kim.Study();
        System.out.println(kim.getName());
        System.out.println(kim.toString());

        System.out.println("===================================================");

//      2.계좌 계설 및 입금, 출금, 조회 기능 구현해보기

//      BankAccount bankacc = new BankAccount("123-456789-00-000"); //생성시 데이터 전달
        BankAccount bankacc = new BankAccount();

        bankacc.setAccount("123-456789-00-000");
        bankacc.deposit(1000);
        bankacc.Withdrawal(500);
        bankacc.Withdrawal(1000);
        bankacc.moneyCheck();

        System.out.println(bankacc.toString());
    }
}
