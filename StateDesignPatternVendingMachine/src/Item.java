public class Item {

    private String itemCode;
    private int price;
    private String name;

    public Item(String itemCode, int price, String name) {
        this.itemCode = itemCode;
        this.price = price;
        this.name = name;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
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
}
