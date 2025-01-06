import java.util.Scanner;

public abstract class Legos {
    private String ageRange;
    private String numPieces;
    private String type;
    private boolean big;

    public Legos(String ageRange, String numPieces, String type, boolean big) {
        this.ageRange = ageRange;
        this.numPieces = numPieces;
        this.type = type;
        this.big = big;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public String getNumPieces() {
        return numPieces;
    }

    public String getType() {
        return type;
    }

    public boolean isBig() {
        return big;
    }

    public abstract void displayInfo();

    public abstract double getPrice();

    public static void main(String[] args) {
        Legos lego = new Technic("Technic", "14+", "500", true);
        lego.displayInfo();
        shoppingExperience(); // Call shoppingExperience from main to start the program
    }

    public static void shoppingExperience() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Lego Store!");
        System.out.println("Select an option:");
        System.out.println("1. View Lego Sets");
        System.out.println("2. Start Shopping");
        System.out.println("3. Exit");

        int initialChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (initialChoice) {
            case 1:
                viewLegoSets();
                shoppingExperience(); // Recursively call shoppingExperience after viewing sets
                break;
            case 2:
                makePurchase();
                break;
            case 3:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice.");
                shoppingExperience(); // Recursively call shoppingExperience for invalid input
        }
    }

    private static void viewLegoSets() {
        System.out.println("\nLego Set Information:");
        System.out.println("1. Technic: Generally for older children and teens, often featuring complex mechanical models.");
        System.out.println("2. Star Wars: Based on the popular Star Wars franchise, featuring spaceships, characters, and battle scenes.");
        System.out.println("3. Duplo: Designed for younger children, with larger, safer bricks and easy-to-build models.");
        System.out.println("4. Botanical Collection: Focuses on realistic plant models, ideal for adults and older children who enjoy intricate builds.");
    }

    private static void makePurchase() {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        int choice; // Declare choice here

        do {
            System.out.println("\nSelect your Lego set:");
            System.out.println("1. Technic");
            System.out.println("2. Star Wars");
            System.out.println("3. Duplo");
            System.out.println("4. Botanical Collection");
            System.out.println("5. Finish Shopping");

            choice = scanner.nextInt();
            scanner.nextLine();

            Legos selectedLego = null;

            switch (choice) {
                case 1:
                    selectedLego = new Technic("Technic", "14+", "500", true);
                    break;
                case 2:
                    selectedLego = new StarWars("X-Wing", "8+", "300", false);
                    break;
                case 3:
                    selectedLego = new Duplo("Animals", "1+", "50", false);
                    break;
                case 4:
                    selectedLego = new BotCollec("Rose", "18+", "300", true);
                    break;
                case 5:
                    break; // Exit the loop when user chooses to finish shopping
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            if (selectedLego != null) { // Check if a valid Lego set was chosen
                System.out.println("Enter 'buy' to purchase:");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("buy")) {
                    System.out.println("Bought " + selectedLego.getType() + " set.");
                    System.out.println("Piece Count: " + selectedLego.getNumPieces());
                    System.out.println("Age Range: " + selectedLego.getAgeRange());
                    System.out.println("Big Set: " + selectedLego.isBig());
                    System.out.println("Price: $" + selectedLego.getPrice());
                    totalCost += selectedLego.getPrice();
                }
            }

        } while (choice != 5); // Continue the loop until user chooses to finish shopping

        System.out.println("Total cost: $" + totalCost);
    }
}