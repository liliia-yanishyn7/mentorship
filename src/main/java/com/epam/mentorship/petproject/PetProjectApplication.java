package com.epam.mentorship.petproject;

import com.epam.mentorship.petproject.entity.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PetProjectApplication {

	public static void main(String[] args) {

		Address address = new Address("Ukraine","Lviv", "Petliury" , 25);
		User user = new User("Liliia Yanishyn", "liliya_7@yahoo.com", address);

		ProductCategory category1 = new ProductCategory("PC");
		ProductCategory category2 = new ProductCategory("laptop");
		ProductCategory category3 = new ProductCategory("PC equipment");
		Item item1 = new Item("Asus VivoBook 17", 1000, category2,"Asus-Laptop");
		Item item2 = new Item("Samsug N-1267", 1500, category1,"Personal Computer");
		Item item3 = new Item("Jabra-12", 25, category3,"Earphones for Skype");
		List<Item> items = new ArrayList<>();
		items.add(item1);
		items.add(item2);
		items.add(item3);

		//items.stream().forEach(x -> System.out.println(x.toString()));

		Order userOrder = new Order(items);

		Payment payment = new Payment(PaymentType.CASH, userOrder);

		Delivery delivery = new Delivery(user, userOrder);

		System.out.println(delivery);

	}
}
