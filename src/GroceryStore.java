// Concrete Mediator
class GroceryStore implements GroceryStoreMediator {
    private Cashier cashier;
    private Customer customer;

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void sendMessage(String message, Person person) {
        if (person == cashier) {
            customer.receiveMessage(message);
        } else if (person == customer) {
            cashier.receiveMessage(message);
        }
    }
}
