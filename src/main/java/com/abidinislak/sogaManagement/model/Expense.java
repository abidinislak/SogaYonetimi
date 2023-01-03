package com.abidinislak.sogaManagement.model;

import com.abidinislak.sogaManagement.model.modelUtil.BaseEntity;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.util.Date;

//
//@Entity
//@EntityListeners(AuditingEntityListener.class)
//@Audited



@Entity
@Audited
@EntityListeners(AuditingEntityListener.class)
public class Expense extends BaseEntity {


    private String descrition;

    private float amount;


    private Date date;

    private byte [] content;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
