// Concrete Cashier class
class Cashier extends Person {
    public Cashier(GroceryStoreMediator mediator) {
        super(mediator);
    }

    public void sendMessage(String message) {
        System.out.println("Cashier sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Cashier received: " + message);
    }
}