// Subclass for Coffee
class Coffee extends Beverage {
    private String condiment;

    public Coffee(String condiment) {
        this.condiment = condiment;
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding " + condiment);
    }
}

// same as a tea class
// this class also provides implementation for preparing coffee
// for this class we have also created two methods