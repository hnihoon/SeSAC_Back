package Goods;

public class Snack {
    private String snackName;
    private int snackPrice;
    private int snackQuantity;

    public Snack(String snackName, int snackPrice) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
    }

    public void snackReceiveGoods(int snack){
        setSnackQuantity(snack);
        System.out.println("보유수량 : " + getSnackQuantity());
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getSnackQuantity() {
        return snackQuantity;
    }

    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }
}
