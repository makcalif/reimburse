package com.expenseworld.reimburse.respositories;

import com.expenseworld.reimburse.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ExpensesRepository extends JpaRepository<Expense, Long>{
    Collection<Expense> findByName(String name);
}
