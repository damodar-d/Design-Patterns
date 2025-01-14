import java.util.List;

public interface MachineState {
    void clickOnInsertCoinButton(VendingMachine vm);
    void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    void insertCoin ( VendingMachine machine, Coin coin) throws Exception;
    void chooseProduct (VendingMachine vendingMachine, String productCode) throws Exception;
    int getChange(int returnMoney) throws Exception;
    Item dispenseProduct(VendingMachine vendingMachine, String productCode) throws Exception;
    List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
    void updateInventory(VendingMachine vendingMachine, Item ite, String productCode) throws Exception;



}
