public class Technic extends Legos {
    private String vehicleType;


    public Technic(String type, String ageRange, String numPieces, boolean big) {
        super(ageRange, numPieces, type, big);
        this.vehicleType = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Technic Set:");
        System.out.println("Type: " + getType());
        System.out.println("Age Range: " + getAgeRange());
        System.out.println("Number of Pieces: " + getNumPieces());
        System.out.println("Big: " + isBig());
        System.out.println("Vehicle Type: " + vehicleType);
    }

    @Override
    public double getPrice() {
        return 199.99;
    }


    public static void main(String[] args) {
        Technic techLego = new Technic("Mclaren", "14+", "500", true);
        techLego.displayInfo();
    }
}
