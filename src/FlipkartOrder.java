public class FlipkartOrder {
    public static void main(String[] args) {
        String item ="bluetooh speaker";

        double price=1342.45;

        int   quantity=4;

        // total cost of the item
        double total_cost= price * quantity;
        System.out.println(total_cost);
        System.out.println("----------------------");
        System.out.println("FLIPKART RECEIPT");
        System.out.println("______________________");
        System.out.println("Item:   " + item);
        System.out.println("Price:  " + price);
        System.out.println("Qty:    " + quantity);
        System.out.println("-------------------------");
        System.out.println("Total:  " + total_cost);
        System.out.println("-------------------------");





    }
}
