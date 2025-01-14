import java.util.List;

public class Shelf {

    List<Item> itemsOnShelf;
    boolean isShelfSoldOut;


    public List<Item> getItemsOnShelf() {
        return itemsOnShelf;
    }

    public void setItemsOnShelf(List<Item> item) {
        this.itemsOnShelf = item;
    }

    public boolean isSoldOut() {
        return isShelfSoldOut;
    }

    public void setSoldOut(boolean soldOut) {
        isShelfSoldOut = soldOut;
    }
}
