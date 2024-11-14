import java.util.ArrayList;
import java.util.List;

class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phone;
    private List<Order> orders;

    // Constructor
    public Customer(String customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.orders = new ArrayList<>();
    }

    // Methods
    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> viewOrders() {
        return orders;
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}