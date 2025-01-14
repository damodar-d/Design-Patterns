import javax.crypto.Mac;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        VendingMachine vendingMachine = new VendingMachine();
        try{
            System.out.println("| Filling up the Inventory |");

            fillUpTheInventory(vendingMachine);
            displayTheInventory(vendingMachine);

            MachineState vendingState = new IdleState();
            vendingMachine.setVendingMachineState(vendingState);

            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getCurrentStateOfMachine();

            vendingMachine.insertCoin(vendingMachine,Coin.PENNY);
            vendingMachine.insertCoin(vendingMachine,Coin.DIME);

            System.out.println("| Clicking on the product Selection Button |");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState = vendingMachine.getCurrentStateOfMachine();

            vendingState.chooseProduct(vendingMachine,"101");

            displayTheInventory(vendingMachine);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private static void fillUpTheInventory(VendingMachine vendingMachine){

            vendingMachine.getInventory().
    }

    private static void displayTheInventory(VendingMachine vendingMachine){

    }
}