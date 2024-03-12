package com.Lab5;
import java.util.ArrayList;
import java.util.List;

interface Product {
    void showProduct();
    void addProduct(String productName, double price);
    void deleteProduct(String productName);
    double calculateProductPrice();
}

class OnlineProduct implements Product {
    private List<String> products;
    private List<Double> prices;

    public OnlineProduct() {
        products = new ArrayList<>();
        prices = new ArrayList<>();
    }

    @Override
    public void showProduct() {
        System.out.println("Online Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i) + " - $" + prices.get(i));
        }
    }

    @Override
    public void addProduct(String productName, double price) {
        products.add(productName);
        prices.add(price);
    }

    @Override
    public void deleteProduct(String productName) {
        int index = products.indexOf(productName);
        if (index != -1) {
            products.remove(index);
            prices.remove(index);
        }
    }

    @Override
    public double calculateProductPrice() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }
}

class PhysicalProduct implements Product {
    private List<String> products;
    private List<Double> prices;

    public PhysicalProduct() {
        products = new ArrayList<>();
        prices = new ArrayList<>();
    }

    @Override
    public void showProduct() {
        System.out.println("Physical Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i) + " - $" + prices.get(i));
        }
    }

    @Override
    public void addProduct(String productName, double price) {
        products.add(productName);
        prices.add(price);
    }

    @Override
    public void deleteProduct(String productName) {
        int index = products.indexOf(productName);
        if (index != -1) {
            products.remove(index);
            prices.remove(index);
        }
    }

    @Override
    public double calculateProductPrice() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }
}

class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Ordered Products:");
        for (Product product : products) {
            product.showProduct();
        }
        double totalPrice = calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }

    private double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.calculateProductPrice();
        }
        return totalPrice;
    }
}

public class EcommerceSystem {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Shubham Bhole", "shubh@example.com");

        // Create products
        Product onlineProduct = new OnlineProduct();
        onlineProduct.addProduct("Laptop", 1200);
        onlineProduct.addProduct("Smartphone", 800);

        Product physicalProduct = new PhysicalProduct();
        physicalProduct.addProduct("Book", 20);
        physicalProduct.addProduct("T-Shirt", 25);

        // Create orders
        Order order1 = new Order(customer1);
        order1.addProduct(onlineProduct);
        order1.addProduct(physicalProduct);

        // Show order details
        order1.showOrderDetails();
		

	}

}
