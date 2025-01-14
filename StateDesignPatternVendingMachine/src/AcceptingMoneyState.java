import java.util.List;

public class AcceptingMoneyState implements MachineState{
    @Override
    public void clickOnInsertCoinButton(VendingMachine vm) {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        machine.getCoinList().add(coin);
        System.out.println("Coin Added Successfully");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, String productCode) throws Exception {
        throw new Exception("You cannot choose product in the money accepting state");
    }

    @Override
    public int getChange(int returnMoney) throws Exception {
        throw new Exception("You cannot get a change in the money accepting state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, String productCode) throws Exception {
        throw new Exception("You cannot dispense a product in the money accepting state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned the full amount back in the dispense tray");
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item ite, String productCode) throws Exception {
        throw new Exception("You cannot update the inventory in the money accepting state");
    }
}
