// Main class to demonstrate the Template Method pattern
import java.util.Scanner;

public class TemplateMethodPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your beverage (tea/coffee): ");
        String beverageType = scanner.nextLine().toLowerCase();

        System.out.println("Enter your condiment (e.g., lemon, sugar, milk): ");
        String condiment = scanner.nextLine();

        Beverage beverage;

        if (beverageType.equals("tea")) {
            beverage = new Tea(condiment);
        } else if (beverageType.equals("coffee")) {
            beverage = new Coffee(condiment);
        } else {
            System.out.println("Invalid choice! Please choose either tea or coffee.");
            scanner.close();
            return;
        }

        beverage.prepareRecipe();
        scanner.close();
    }
}

// in our example this is a main class
// this class creates instances of tea and coffee
// also in this case we have called template method on both instances

// we think that this example effectively showcases  the principles of the template method pattern
// by providing a clear structure for an algorithm.