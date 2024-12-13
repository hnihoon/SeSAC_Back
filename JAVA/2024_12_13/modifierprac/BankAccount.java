package modifierprac;

public class BankAccount {
    private String account = "";
    private int money = 0;

    public BankAccount() {}

    public BankAccount(String account) {
        this.account = account;
    }


    public void deposit(int money){
        this.money += money;
        System.out.println("Success : " + this.money);
    }

    public void Withdrawal(int money){
        if(this.money < money){
            System.out.println("fail😌😌😌😌😌");
        } else {
            this.money -= money;
            System.out.println("Success : " + this.money);
        }
    }

    public void moneyCheck(){
        System.out.println("Success : " + this.money);
    }

    public String getAccount() {
        return account;
    }

    public int getMoney() {
        return money;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account='" + account + '\'' +
                ", money=" + money +
                '}';
    }
}
