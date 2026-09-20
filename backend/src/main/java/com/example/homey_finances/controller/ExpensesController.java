package com.example.homey_finances.controller;

import com.example.homey_finances.dto.AddExpenseRQ;
import com.example.homey_finances.dto.AddExpenseRS;
import com.example.homey_finances.service.ExpensesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpensesController {
    private final ExpensesService expensesService;

    public ExpensesController(ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @PostMapping("/expenses/add")
    public AddExpenseRS addExpense(@RequestBody AddExpenseRQ request) {
                                                   
        return this.expensesService.addExpense(request);
        
    }
}
