package com.abidinislak.sogaManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    public User(short userName, String personName, String personLastName) {
        this.userName = userName;
        this.personName = personName;
        this.personLastName = personLastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    private short userName;


    private String personName;


    private String personLastName;


    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public short getUserName() {
        return userName;
    }

    public void setUserName(short userName) {
        this.userName = userName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    @Override
    public String toString() {
        return userName+","+personName+","+personLastName;
    }
}
