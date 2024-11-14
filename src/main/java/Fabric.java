class Fabric {
    private String id;
    private String type;
    private String color;
    private double pricePerMeter;

    // Constructor
    public Fabric(String id, String type, String color, double pricePerMeter) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.pricePerMeter = pricePerMeter;
    }

    // Method
    public double calculateCost(double meters) {
        return meters * pricePerMeter;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getPricePerMeter() {
        return pricePerMeter;
    }
}