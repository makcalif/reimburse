package com.expenseworld.reimburse.controller;

import com.expenseworld.reimburse.domain.Expense;
import com.expenseworld.reimburse.respositories.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

//@RestController
// try @RepositoryRestResource in repository for HATEOAS
public class ExpenseController {

    private ExpensesRepository expensesRepository;

    @Autowired
    public ExpenseController (ExpensesRepository expensesRepository) {
        this.expensesRepository = expensesRepository;
    }

    @RequestMapping("/expenses")
    Collection<Expense> expenses () {
        return this.expensesRepository.findAll();
    }
}

