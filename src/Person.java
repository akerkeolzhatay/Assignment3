// Abstract Person class
abstract class Person {
    protected GroceryStoreMediator mediator;

    public Person(GroceryStoreMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receiveMessage(String message);
}