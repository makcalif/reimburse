package com.expenseworld.reimburse;

import com.expenseworld.reimburse.domain.Expense;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReimburseApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testAPI() {
		ResponseEntity<Expense> response = restTemplate.getForEntity("/api/expenses", Expense.class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

	}



}
