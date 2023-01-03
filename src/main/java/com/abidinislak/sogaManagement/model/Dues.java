package com.abidinislak.sogaManagement.model;

import com.abidinislak.sogaManagement.model.modelUtil.BaseEntity;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Audited
public class Dues extends BaseEntity {


    private String discription;


    private float amount;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDuesPayDay() {
        return duesPayDay;
    }

    public void setDuesPayDay(Date duesPayDay) {
        this.duesPayDay = duesPayDay;
    }
}
