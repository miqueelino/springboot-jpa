package com.exeweb.ServiceJPA.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exeweb.ServiceJPA.entities.Order;
import com.exeweb.ServiceJPA.entities.User;
import com.exeweb.ServiceJPA.entities.enums.OrderStatus;
import com.exeweb.ServiceJPA.repositories.OrderRepository;
import com.exeweb.ServiceJPA.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "Jane Brown", "maria@gmail.com", "988888888", "123456");
		User user2 = new User(null, "Bob Green", "alex@gmail.com" , "977777777", "123456");
		
		
		


		Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, user1);
		Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, user2);

		userRepository.saveAll(Arrays.asList(user1, user2));

		orderRepository.saveAll(Arrays.asList(order1, order2));	
		
		
		
		
		
		
	}
	
	
	
	

}
