import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private MachineState currentStateOfMachine;
    private List<Coin> coinList;
    private Inventory inventory;

    public VendingMachine() {
        this.currentStateOfMachine = new IdleState();
        this.coinList = new ArrayList<>();
        this.inventory = new Inventory(10);
    }

    public void setCoins(List<Coin> coins){
        this.coinList = coins;
    }

    public void insertCoin(VendingMachine vendingMachine, Coin coin){
        this.coinList.add(coin);
    }

    public void setVendingMachineState(MachineState state){
        currentStateOfMachine = state;
    }

    public List<Coin> getCoinList(){
        return this.coinList;
    }

    public Inventory getInventory(){
        return this.inventory;
    }

    public MachineState getCurrentStateOfMachine() {
        return currentStateOfMachine;
    }
}
