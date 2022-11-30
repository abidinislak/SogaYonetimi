package com.abidinislak.sogaManagement.Util;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.ManyToOne;
import java.util.Date;

public class MultiplePayment {
    private String discription;
    private float amount;
    @ManyToOne
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payDay;


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

    public Date getPayDay() {
        return payDay;
    }

    public void setPayDay(Date payDay) {
        this.payDay = payDay;
    }
}
