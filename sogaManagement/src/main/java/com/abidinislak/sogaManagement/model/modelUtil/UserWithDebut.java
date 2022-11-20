package com.abidinislak.sogaManagement.model.modelUtil;

public class UserWithDebut {

    private String userName;
    private float payment;

    private float dues;


    public UserWithDebut(String userName, float payment, float dues) {
        this.userName = userName;
        this.payment = payment;
        this.dues = dues;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public float getDues() {
        return dues;
    }

    public void setDues(float dues) {
        this.dues = dues;
    }
}
