/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekwill.EmployeeModel;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Andrei
 */
public class ContactDetails {

    private Integer id;
    private Job job;
    private LocalDate birthday;
    private Address address;

    public ContactDetails(Integer id, Job job, LocalDate birthday, Address address) {
        this.id = id;
        this.job = job;
        this.birthday = birthday;
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }



    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContactDetails other = (ContactDetails) obj;
        if (!Objects.equals(this.job, other.job)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.birthday, other.birthday)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nJob: "+this.job+"\nBirthday: "+this.birthday+"\nAddress: "+this.address;
    }

}
