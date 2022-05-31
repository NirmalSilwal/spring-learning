package org.annotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

//    @Autowired
    private Address address;

    public Employee() {
        super();
    }

//    @Autowired
    public Employee(Address address) {
        super();
        this.address = address;
        System.out.println("inside emp constructor");
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("address2")
    public void setAddress(Address address) {
        this.address = address;
        System.out.println("inside emp setter method");
    }

    @Override
    public String toString() {
        return "Employee {" +
                "address=" + address +
                '}';
    }
}
