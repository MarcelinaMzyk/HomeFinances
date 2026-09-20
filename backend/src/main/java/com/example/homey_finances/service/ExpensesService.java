package com.example.homey_finances.service;

import com.example.homey_finances.dto.AddExpenseRQ;
import com.example.homey_finances.dto.AddExpenseRS;
import com.example.homey_finances.entity.Expense;
import com.example.homey_finances.repository.ExpensesRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpensesService {

    private final ExpensesRepository expensesRepository;

    public ExpensesService(ExpensesRepository expensesRepository) {
        this.expensesRepository = expensesRepository;
    }

    public AddExpenseRS addExpense(AddExpenseRQ request) {

         Expense expense = new Expense(
                request.name(),
                request.amount(),
                request.currency()
        );

        expensesRepository.save(expense);

        return new AddExpenseRS("Expense added successfully");
    }
}
