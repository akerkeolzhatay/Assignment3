// Main class
public class GroceryStoreMediatorPattern {
    public static void main(String[] args) {
        GroceryStore store = new GroceryStore();
        Cashier cashier = new Cashier(store);
        Customer customer = new Customer(store);

        store.setCashier(cashier);
        store.setCustomer(customer);

        // Customer sends a message to the cashier
        customer.sendMessage("I'd like to buy some apples.");
        // Cashier responds to the customer
        cashier.sendMessage("That will be $5, please.");
    }
}
