class StarWars extends Legos {
    private String shipType;

    public StarWars(String type, String agerange, String numPieces, boolean big) {
        super(agerange, numPieces, type, big);
        this.shipType = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Star Wars Set:");
        System.out.println("Type: " + getType());
        System.out.println("Age Range: " + getAgeRange());
        System.out.println("Number of Pieces: " + getNumPieces());
        System.out.println("Big Set: " + isBig());
        System.out.println("Ship Type: " + shipType);
    }

    @Override
    public double getPrice() {
        return 49.99;
    }

    public static void main(String[] args) {
        StarWars swLego = new StarWars("X-Wing", "8+", "300", false);
        swLego.displayInfo();
    }
}
