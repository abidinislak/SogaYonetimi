package com.abidinislak.sogaManagement.model;


import com.abidinislak.sogaManagement.model.modelUtil.BaseEntity;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.hibernate.envers.Audited;

import javax.persistence.*;

import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

@Entity
@Audited(targetAuditMode = NOT_AUDITED)
public class Phone  extends BaseEntity {

    public Phone() {
    }

    private String phoneNumber;


    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @ManyToOne
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
