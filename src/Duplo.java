class Duplo extends Legos {
    private String theme;


    public Duplo(String type, String agerange, String numPieces, boolean big) {
        super(agerange, numPieces, type, big);
        this.theme = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Duplo Set:");
        System.out.println("Type: " + getType());
        System.out.println("Age Range: " + getAgeRange());
        System.out.println("Number of Pieces: " + getNumPieces());
        System.out.println("Big Set: " + isBig());
        System.out.println("Theme: " + theme);
    }

    @Override
    public double getPrice() {
        return 24.99;
    }

    public static void main(String[] args) {
        Duplo dupLego = new Duplo("Animals", "1+", "50", false);
        dupLego.displayInfo();
    }
}

