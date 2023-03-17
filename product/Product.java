package product;

public class Product {
    private String name;
    private int price;
    private int id;
    private String describe;
    public Product(String name,String describe, int price, int id ){
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "com.example.model.Product [name=" + name + ",describe=" + describe +", price=" + price +",id=" + id + "]";
    }
}
