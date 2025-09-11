import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
     static class Item {
        String itemName;
        double price;
        int quantity;

        Item(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }
    }

    ArrayList<Item> items = new ArrayList<>();

    public void addItem(String itemName, double price, int quantity) {
        for (Item item : items) {
            if (item.itemName.equals(itemName)) {
                item.quantity += quantity;
                System.out.println("Updated " + itemName + ": new quantity = " + item.quantity);
                return;
            }
        }
        items.add(new Item(itemName, price, quantity));
        System.out.println("Added " + itemName + " to cart.");
    }

    public void removeItem(String itemName, int quantity) {
        for (Item item : items) {
            if (item.itemName.equals(itemName)) {
                if (quantity >= item.quantity) {
                    items.remove(item);
                    System.out.println("Removed " + itemName + " from cart.");
                } else {
                    item.quantity -= quantity;
                    System.out.println("Reduced " + itemName + " quantity to " + item.quantity);
                }
                return;
            }
        }
        System.out.println("Item " + itemName + " not found in cart.");
    }

    public double totalCost() {
        double total = 0;
        for (Item item : items) {
            total += item.price * item.quantity;
        }
        return total;
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Items in the cart:");
        for (Item item : items) {
            System.out.println("- " + item.itemName + " | Price: " + item.price + " | Quantity: " + item.quantity);
        }
        System.out.println("Total cost: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();
        Scanner scanner = new Scanner(System.in);

        cart.addItem("Apple", 10.0, 3);
        cart.addItem("Banana", 5.0, 6);
        cart.displayCart();
        cart.addItem("Apple", 10.0, 2);
        cart.removeItem("Banana", 3);
        cart.displayCart();
        cart.removeItem("Apple", 5);
        cart.displayCart();

        scanner.close();
    }
}
