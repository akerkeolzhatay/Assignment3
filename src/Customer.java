// Concrete Customer class
class Customer extends Person {
    public Customer(GroceryStoreMediator mediator) {
        super(mediator);
    }

    public void sendMessage(String message) {
        System.out.println("Customer sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Customer received: " + message);
    }
}
