package com.intern.backend.entity;



public class Order {
    private String orderId;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    // Nested class
    public static class OrderSummary{
        private double totalAmount;
        private int totalItems;

        public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
        public void setTotalItems(int totalItems) { this.totalItems = totalItems; }

        public void display(){
            System.out.println("Total Amount: " + totalAmount);
            System.out.println("Total Items: " + totalItems);
        }
    }

    // Inner class
    public class OrderItem {
        private Product product;
        private int quantity;

        public void setProductName(Product product) {
            this.product = product;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void display(){
            product.display();
            System.out.println(quantity);
        }
    }
}
