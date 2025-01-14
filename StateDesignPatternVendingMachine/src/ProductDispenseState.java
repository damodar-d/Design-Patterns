import java.util.List;

public class ProductDispenseState implements MachineState{
   String itemCode;

    public ProductDispenseState(VendingMachine vendingMachine, String itemCode) {
        this.itemCode = itemCode;
        dispenseProduct(vendingMachine,itemCode);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vm) {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, String productCode) throws Exception {

    }

    @Override
    public int getChange(int returnMoney) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, String productCode) throws Exception {
     System.out.println("Dispensing the product");
     Item item = vendingMachine.getInventory().getItem(productCode);
     vendingMachine.getInventory().updateSoldOutItem();


        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return List.of();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item ite, String productCode) throws Exception {

    }
}
