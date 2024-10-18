// Subclass for Tea
class Tea extends Beverage {
    private String condiment;

    public Tea(String condiment) {
        this.condiment = condiment;
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding " + condiment);
    }
}

// in our case this class provides a specific implementation for preparing tea
// this concrete class includes two methods