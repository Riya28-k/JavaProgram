package Ecommerce;

import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
    }
}

class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
        customer.displayCustomer();
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public double calculateTotalCost() {
        return product.getPrice() * quantity;
    }
}

public class EcommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Product Name:");
        String productName = sc.nextLine();

        System.out.println("Enter Product Price:");
        double productPrice = sc.nextDouble();
        sc.nextLine(); 

       
        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();

        
        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();

        
        Product product = new Product(productName, productPrice);
        Customer customer = new Customer(customerName);
        Order order = new Order(customer, product, quantity);

        
        System.out.println("\nOrder Summary");
        order.placeOrder();

        sc.close();
    }
}
