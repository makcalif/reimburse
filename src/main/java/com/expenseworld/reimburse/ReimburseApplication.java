package com.expenseworld.reimburse;

import com.expenseworld.reimburse.domain.Expense;
import com.expenseworld.reimburse.respositories.ExpensesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ReimburseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReimburseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ExpensesRepository expensesRepository) {
			return  ( args -> {
				Arrays.asList("travel, movie, lunch, car rental".split(","))
						.forEach(e -> expensesRepository.save(new Expense(e)) );

				expensesRepository.findAll().forEach(System.out::println	);
			});
	}


}
