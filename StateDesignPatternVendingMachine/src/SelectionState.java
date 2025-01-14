import java.util.List;

public class SelectionState implements MachineState{

    @Override
    public void clickOnInsertCoinButton(VendingMachine vm) {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are already in the product selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert a coin in the product selection state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, String productCode) throws Exception {

        Item item = vendingMachine.getInventory().getItem(productCode);
        int totalPaidByUser = 0;
        for(Coin coin: vendingMachine.getCoinList()){
            totalPaidByUser += coin.value;
        }

        if(totalPaidByUser < item.getPrice()){
            System.out.println("Insufficient Funds! You have paid: "+ totalPaidByUser +" but the item: "+item.getName()+" costs: "+item.getPrice() );
            refundFullMoney(vendingMachine);
            throw new Exception("Money Refunded");
        }
        else if(totalPaidByUser >= item.getPrice()){
            if(totalPaidByUser > item.getPrice()){
                getChange(totalPaidByUser - item.getPrice());
            }
            vendingMachine.setVendingMachineState(new ProductDispenseState(vendingMachine,item.getItemCode()));
        }
    }

    @Override
    public int getChange(int extraMoney) throws Exception {
        System.out.println("Returning the extra change money");
        return extraMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, String productCode) throws Exception {
        throw new Exception("You cannot dispense a product in the product selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refunded amount will be back in the dispense tray");
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item ite, String productCode) throws Exception {

    }
}
