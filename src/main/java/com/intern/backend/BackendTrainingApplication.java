package com.intern.backend;

import com.intern.backend.entity.Category;
import com.intern.backend.entity.Order;
import com.intern.backend.entity.Product;
import com.intern.backend.repository.Payable;
import com.intern.backend.service.BankPayment;
import com.intern.backend.service.CashPayment;
import com.intern.backend.service.InventoryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.intern.backend.enums.ProductStatus.AVAILABLE;

@SpringBootApplication
public class BackendTrainingApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BackendTrainingApplication.class, args);
		List<Payable> paymentMethods = new ArrayList<>();
		paymentMethods.add(new CashPayment());
		paymentMethods.add(new BankPayment());
		for (Payable payment: paymentMethods){
			payment.pay(500);
		}

		// ========================================================================//
		Order order = new Order();
		order.setOrderId("ORD-001");
		// Nested class
		Order.OrderSummary nested = new Order.OrderSummary();
		nested.setTotalAmount(999);
		nested.setTotalItems(9);
		nested.display();
		// Inner class
		Order.OrderItem inner = order.new OrderItem();

		StringBuilder description = new StringBuilder();
		description.append("An apple");
		description.append("\nFrom: VietNam");
		Product product = new Product(100001, "Apple", description, 99, AVAILABLE );
		inner.setProductName(product);
		inner.setQuantity(4);
		inner.display();

		// ========================================================================//
		// Exception
//		InventoryService inventoryService = new InventoryService();
//		try{
//			inventoryService.reduceStock(product, 20);
//		} catch (RuntimeException e) {
//            throw new RuntimeException(e);
//        }


		try (BufferedWriter writer =
					 new BufferedWriter(
							 new FileWriter("products.txt"))) {

			writer.write("P001,Laptop,15000000");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
