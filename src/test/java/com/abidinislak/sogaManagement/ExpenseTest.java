package com.abidinislak.sogaManagement;

import com.abidinislak.sogaManagement.model.Expense;
import com.abidinislak.sogaManagement.repository.ExpenseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class ExpenseTest {



    @Autowired
    ExpenseRepository repo;


    @Test
    public void saveExpenseTest(){



        File file=new File("/home/relax/Desktop/oca  ceritification.pdf");


        Expense doc=new Expense();

        doc.setDescrition(file.getName());
        try {
            doc.setContent(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        repo.save(doc);


        assertTrue(doc.getId()>0);





        Expense tempExpense=new Expense();

        tempExpense.setDescrition("test save");
        tempExpense.setAmount(123);
        tempExpense.setDate(new Date());

    var saved=    repo.save(tempExpense);

        assertTrue(saved.getId()>1);


    }


}
