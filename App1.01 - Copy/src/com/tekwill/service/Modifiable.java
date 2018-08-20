package com.tekwill.service;

import com.tekwill.EmployeeModel.Address;
import com.tekwill.EmployeeModel.ContactDetails;
import com.tekwill.EmployeeModel.Country;
import com.tekwill.EmployeeModel.Employee;
import com.tekwill.EmployeeModel.Job;
import java.time.LocalDate;
import java.util.Map;
import javafx.beans.Observable;

public interface Modifiable {

    void createEmployee(String name, Integer id, ContactDetails contact);

    ContactDetails createContact(Integer id, Job job, LocalDate birthday, Address address);

    Address createAddress(Integer id, Country country, String postCode, String street);

    void employeeUpdate(String name, Integer id, ContactDetails contact);

    ContactDetails contactUpdate(Integer id, Job job, LocalDate birthday, Address address);

    Address addressUpdate(Integer id, Country country, String postCode, String street);

    void delete(int key);

    void delete(String name);

    void showEmployeeMap();

    Map<Integer, Employee> getEmployeeMap();

    Map<Integer, ContactDetails> getContactMap();

    Map<Integer, Address> getAddressMap();

    Employee getNewEmployee();
}
