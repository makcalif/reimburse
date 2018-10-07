package com.expenseworld.reimburse.respositories;

import com.expenseworld.reimburse.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface ExpensesRepository extends JpaRepository<Expense, Long>{
    Collection<Expense> findByName(@Param("en") String name);
}
