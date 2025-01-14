import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Shelf> shelfList;
    private int shelfCount;

    public Inventory(int shelfCount){
        this.shelfList = new ArrayList<Shelf>(shelfCount);
        this.shelfCount = shelfCount;

    }

    public List<Shelf> getInventory(){
        return this.shelfList;
    }

    public void setInventory (List<Shelf> shelfList){
        this.shelfList = shelfList;
    }

    public Item getItem(String itemCode){
        int ic = Integer.getInteger(itemCode);
        if(ic==1){ // COKE
            List
        }
        else if(ic ==2){ //PEPSI{

        }
        else if(ic==3){ //WATER

        }
        else{

        }



    }

//    public void addItem(Item item, String itemCode) throws Exception{
//        for(ItemShelf shelf: this.itemShelf){
//            if()
//        }
//    }
}
