import java.util.ArrayList;
import java.util.List;

public class IdleState implements MachineState  {

    public IdleState() {
        System.out.println("Currently Vending Machine is in the idle State");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending Machine is in the idle State");
        machine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vm) {
        vm.setVendingMachineState(new AcceptingMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You have not inserted Money Yet ! You cannot select the product !");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coin in the idle state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, String productCode) throws Exception {
        throw new Exception("You cannot choose product in the idle state");
    }

    @Override
    public int getChange(int returnMoney) throws Exception {
        throw new Exception("You cannot get refund in the idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, String productCode) throws Exception {
        throw new Exception("You cannot get a product in the idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You cannot get full refund in the idle state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item ite, String productCode) throws Exception {

    }
}
