public class ProjectGarmint {
    public static void main(String[] args) {
      
        Fabric cottonFabric = new Fabric("F001", "Cotton", "White", 15.0);
        Fabric polyesterFabric = new Fabric("F002", "Polyester", "Blue", 10.0);

        
        Supplier supplier = new Supplier("S001", "ABC Textiles", "contact@abctextiles.com");
        supplier.addFabric(cottonFabric);
        supplier.addFabric(polyesterFabric);

        Garment tShirt = new Garment("G001", "T-Shirt", "Comfortable cotton T-shirt", "M", "White", 20.0, 50, cottonFabric);
        Garment pants = new Garment("G002", "Pants", "Casual polyester pants", "L", "Blue", 30.0, 30, polyesterFabric);


        Inventory inventory = new Inventory();
        inventory.addGarment(tShirt);
        inventory.addGarment(pants);
        
        Customer customer = new Customer("C001", "John Doe", "john.doe@example.com", "123-456-7890");

       
        Order order = new Order("O001");
        order.addGarment(tShirt);
        order.addGarment(pants);

        // Place the order for the customer
        customer.placeOrder(order);

        // Print order details
        order.printOrderDetails();

        // Update stock for the garment
        tShirt.updateStock(-5);  // Sold 5 T-shirts
        System.out.println("Updated Stock for T-Shirt: " + tShirt.getStockQuantity());

        // Check inventory
        Garment foundGarment = inventory.findGarment("G001");
        if (foundGarment != null) {
            System.out.println("Garment found in Inventory: " + foundGarment.getName());
        } else {
            System.out.println("Garment not found in Inventory.");
        }
    }
}
