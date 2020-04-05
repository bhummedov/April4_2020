package April4_2020;

public class RetailStore {
    private String product;
    private static int totalQuantity;
    private int quantity;

    public RetailStore(String product, int quantity) {
        this.product =product;
        this.quantity = quantity;
    }

    public void receive(int quan) {
        this.quantity+=quan;
        totalQuantity+=this.quantity;

    }
    public void sell(int quan) {
        this.quantity+=quan;
        totalQuantity+=quan;
}
    public void showInventory(){
    System.out.println("showInventory");

    }
    public void showQuantity(){
        System.out.println(this.product+"="+this.quantity);
    }
    public static void showTotalQuantity(){
        System.out.println("total Quantity= "+totalQuantity);
    }

}
