import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Order {
    private String orderId;
    private Date orderDate;
    private List<Garment> garments;
    private double totalAmount;

    // Constructor
    public Order(String orderId) {
        this.orderId = orderId;
        this.orderDate = new Date();
        this.garments = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    // Methods
    public void addGarment(Garment garment) {
        garments.add(garment);
    }

    public double calculateTotalAmount() {
        totalAmount = 0.0;
        for (Garment garment : garments) {
            totalAmount += garment.calculateDiscountPrice(0); // Assuming no discount
        }
        return totalAmount;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Garments in Order:");
        for (Garment garment : garments) {
            System.out.println("- " + garment.getName());
        }
        System.out.println("Total Amount: " + calculateTotalAmount());
    }
}