package com.abidinislak.sogaManagement.Util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserCar {


    private String userName;

    private String nameAndLastName;



    private Set<String> phones= new HashSet<>();;
    private String carPlate;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public void addPhone(String phone)
    {

        this.phones.add(phone);
    }
    public String getNameAndLastName() {
        return nameAndLastName;
    }

    public void setNameAndLastName(String nameAndLastName) {
        this.nameAndLastName = nameAndLastName;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }
}
