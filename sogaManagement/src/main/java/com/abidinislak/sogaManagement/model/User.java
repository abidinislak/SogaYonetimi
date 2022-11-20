package com.abidinislak.sogaManagement.model;

import com.abidinislak.sogaManagement.model.modelUtil.BaseEntity;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Audited
public class User extends BaseEntity {
    private String userName;
    private String personName;
    private String personLastName;


    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles", joinColumns = {
            @JoinColumn(name = "user_id", referencedColumnName = "id")


    }, inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})

    private Set<Role> roles = new HashSet<>();

    public User(String userName, String personName, String personLastName) {
        this.userName = userName;
        this.personName = personName;
        this.personLastName = personLastName;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }


    public void addRole(Role role) {

        this.getRoles().add(role);

    }

    @Override
    public String toString() {
        return userName + "," + personName + "," + personLastName;
    }
}
