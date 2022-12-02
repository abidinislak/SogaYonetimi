package com.abidinislak.sogaManagement.service;


import com.abidinislak.sogaManagement.model.Expense;
import com.abidinislak.sogaManagement.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {



    @Autowired
    ExpenseRepository repo;

    public Expense save(Expense expense){


        return repo.save(expense);
    }


    public List<Expense> findAll(){


        return repo.findAll();
    }

}
