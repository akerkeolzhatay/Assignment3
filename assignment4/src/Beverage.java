abstract class Beverage {
    // Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}

// this abstract class acts as the template for all beverage types
// method prepareRecipe main method in our example its outlines the steps for preparing a beverage
// also we have two concrete methods boilwater() and pourIncup()
// and two abstract methods brew()  and addCondiment()