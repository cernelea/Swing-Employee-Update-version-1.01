package com.tekwill.service;

import com.tekwill.EmployeeModel.Address;
import com.tekwill.EmployeeModel.ContactDetails;
import com.tekwill.EmployeeModel.Employee;
import java.time.LocalDate;
import java.util.Map;
import javafx.beans.Observable;

public interface Modifiable {

    void create(String name, Integer id, ContactDetails contact);

    ContactDetails create(Integer id, String job, LocalDate birthday, Address address);

    Address create(Integer id, String country, String postCode, String street);

    void update(String name, Integer id, ContactDetails contact);

    ContactDetails update(Integer id, String job, LocalDate birthday, Address address);

    Address update(Integer id, String country, String postCode, String street);

    void delete(int key);

    void delete(String name);

    void showEmployeeMap();

    Map<Integer, Employee> getEmployeeMap();

    Map<Integer, ContactDetails> getContactMap();

    Map<Integer, Address> getAddressMap();

    Employee getNewEmployee();
}
