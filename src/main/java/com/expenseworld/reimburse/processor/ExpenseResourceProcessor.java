package com.expenseworld.reimburse.processor;

import com.expenseworld.reimburse.domain.Expense;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
public class ExpenseResourceProcessor implements ResourceProcessor<Resource<Expense>>{
    @Override
    public Resource<Expense> process(Resource<Expense> expenseResource) {
        expenseResource.add(new Link("expenses.s3.amazonaws.com/receipts/"
            + expenseResource.getContent().getId() + ".jpg", "receipt-img"));

        return expenseResource;
    }
}
