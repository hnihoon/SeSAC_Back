package test;

public class Product {
    private String name;
    private int price;
    private String Status;

    public Product(String name, int price, String Status) {
        this.name = name;
        this.price = price;
        this.Status = Status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
