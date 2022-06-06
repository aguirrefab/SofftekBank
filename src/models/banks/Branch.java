package models.banks;

import models.users.Customer;

public class Subsidiary {
    private Integer entityId;
    private String city;
    private String address;
    private Customer customer;

    public Subsidiary(Integer entityId, String city, String address) {
        this.entityId = entityId;
        this.city = city;
        this.address = address;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
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
