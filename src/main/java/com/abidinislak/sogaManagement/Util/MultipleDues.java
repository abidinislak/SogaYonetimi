package com.abidinislak.sogaManagement.Util;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MultipleDues {


    private String discription;


    private float amount;


    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date duesPayDay;


    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDuesPayDay() {
        return duesPayDay;
    }

    public void setDuesPayDay(Date duesPayDay) {
        this.duesPayDay = duesPayDay;
    }
}
