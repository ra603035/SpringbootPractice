package com.employee.practice.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employee")
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private float salary;
    private String department;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    private Veichel veichel;

    public EmployeeDetails() {
    }

    public EmployeeDetails(String name, int age, float salary, String department, Address address,Veichel veichel) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.address = address;
        this.veichel=veichel;

    }

    public int getId() {

        return id;
    }

    public void setId() {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge() {

        this.age = age;
    }

    public float getSalary() {

        return salary;
    }

    public void setSalary(float salary) {

        this.salary = salary;
    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Veichel getVeichel() {
        return veichel;
    }

    public void setVeichel(Veichel veichel) {
        this.veichel = veichel;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", address=" + address +
                ", veichel=" + veichel +

                '}';
    }
}

