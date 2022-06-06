package models.banks;

import models.users.Customer;

public class Branch {
    private Long entityId;
    private String city;
    private String address;
    private Customer customer;

    public Branch(Long entityId, String city, String address) {
        this.entityId = entityId;
        this.city = city;
        this.address = address;
    }

    public Branch(){}

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
