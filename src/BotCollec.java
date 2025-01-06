class BotCollec extends Legos {
    private String plant;


    public BotCollec(String type, String agerange, String numPieces, boolean big) {
        super(agerange, numPieces, type, big);
        this.plant = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Botanical Collection Set:");
        System.out.println("Type: " + getType());
        System.out.println("Age Range: " + getAgeRange());
        System.out.println("Number of Pieces: " + getNumPieces());
        System.out.println("Big Set: " + isBig());
        System.out.println("Plant: " + plant);
    }

    @Override
    public double getPrice() {
        return 59.99;
    }

    public static void main(String[] args) {
        BotCollec botLego = new BotCollec("Rose", "18+", "300", true);
        botLego.displayInfo();
    }
}
