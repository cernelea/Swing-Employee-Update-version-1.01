package com.tekwill.service;

import com.tekwill.EmployeeModel.Address;
import com.tekwill.EmployeeModel.ContactDetails;
import com.tekwill.EmployeeModel.Country;
import com.tekwill.EmployeeModel.Employee;
import com.tekwill.EmployeeModel.Job;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Set;
import javafx.beans.InvalidationListener;

public class Service implements Modifiable {

    private Map<Integer, Employee> employeeMap;
    private Map<Integer, ContactDetails> contactMap;
    private Map<Integer, Address> addressMap;
    private Employee newEmployee;
    public static boolean pohui;

    public Employee getNewEmployee() {
        return newEmployee;
    }

    public Service() {
        this.employeeMap = new HashMap<>();
        this.contactMap = new HashMap<>();
        this.addressMap = new HashMap<>();

    }

    private void createNewEmployee(String name, Integer id, ContactDetails contact) {

        Employee employee = new Employee(name, id, contact);
        employeeMap.put(id, employee);

        newEmployee = employee;

    }

    public void createEmployee(String name, Integer id, ContactDetails contact) {
        this.createNewEmployee(name, id, contact);

    }

    private ContactDetails createNewContact(Integer id, Job job, LocalDate birthday, Address address) {
        ContactDetails contact = new ContactDetails(id, job, birthday, address);
        contactMap.put(id, contact);
        return contact;

    }

    public ContactDetails createContact(Integer id, Job job, LocalDate birthday, Address address) {
        return this.createNewContact(id, job, birthday, address);
    }

    private Address createNewAddress(Integer id, Country country, String postCode, String street) {
        Address address = new Address(id, country, postCode, street);

        addressMap.put(id, address);
        return address;

    }

    public Address createAddress(Integer id, Country country, String postCode, String street) {
        return this.createNewAddress(id, country, postCode, street);
    }

    private void updateEmployeePrivate(String name, Integer id, ContactDetails contact) {
        if (employeeMap.containsKey(id)) {
            Employee employee = employeeMap.get(id);
            employee.setContact(contact);
            employee.setId(id);
            employee.setName(name);
            newEmployee = employee;

        }

    }

    public void employeeUpdate(String name, Integer id, ContactDetails contact) {
        this.updateEmployeePrivate(name, id, contact);

    }

    private ContactDetails updateContactprivate(Integer id, Job job, LocalDate birthday, Address address) {
        ContactDetails contactFoundBy = contactMap.get(id);
        if (contactFoundBy != null) {
            contactFoundBy.setId(id);
            contactFoundBy.setBirthday(birthday);
            contactFoundBy.setJob(job);
            contactFoundBy.setAddress(address);
            return contactFoundBy;
        }
        return null;
    }

    public ContactDetails contactUpdate(Integer id, Job job, LocalDate birthday, Address address) {
        return this.updateContactprivate(id, job, birthday, address);
    }

    private Address updateAdressPrivate(Integer id, Country country, String postCode, String street) {
        Address addressFoundById = addressMap.get(id);
        if (addressFoundById != null) {
            addressFoundById.setCountry(country);
            addressFoundById.setPostCode(postCode);
            addressFoundById.setStreet(street);
            return addressFoundById;
        }
        return null;
    }

    public Address addressUpdate(Integer id, Country country, String postCode, String street) {

        return this.updateAdressPrivate(id, country, postCode, street);
    }

    private void deletePrivate(int key) {
        if (employeeMap.containsKey(key)) {
            employeeMap.remove(key);
        }

    }

    public void delete(int key) {

        this.deletePrivate(key);
    }

    private void deletePrivate(String name) {
        Set<Entry<Integer, Employee>> entries = employeeMap.entrySet();
        for (Entry<Integer, Employee> entry : entries) {
            Employee employee = entry.getValue();
            Integer key = entry.getKey();
            if (employee.getName().equals(name)) {

                employeeMap.remove(key);
                break;
            }

        }

    }

    public void delete(String name) {
        this.deletePrivate(name);
    }

    private void showEmployeeMapPrivate() {

        Set<Entry<Integer, Employee>> entries = employeeMap.entrySet();
        for (Entry<Integer, Employee> entry : entries) {
            Employee employee = entry.getValue();
            Integer key = entry.getKey();
            System.out.println(employee + " " + key);

        }

    }

    public void showEmployeeMap() {
        this.showEmployeeMapPrivate();

    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public Map<Integer, ContactDetails> getContactMap() {

        return contactMap;
    }

    public Map<Integer, Address> getAddressMap() {

        return addressMap;
    }

}
