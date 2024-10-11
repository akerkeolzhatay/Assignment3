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

// our code applied to a grocery store scenario
// it is like communication between customer and cashier
// the cashier and  customer  do not know each other directly instead, they interact with interface Grocerystore
// do not affecting each other we can implement this code