package com.employee.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veichel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String chesisNo;
    private float price;

    public Veichel(String name, String chesisNo, float price){
        this.name = name;
        this.chesisNo = chesisNo;
        this.price = price;
    }

    public int getId() {

        return id;
    }


    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChesisNo() {

        return chesisNo;
    }

    public void setChesisNo(String chesisNo) {

        this.chesisNo = chesisNo;
    }

    public float getPrice() {

        return price;
    }

    public void setPrice(float price) {

        this.price = price;
    }

    @Override
    public String toString() {
        return "Veichel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chesisNo='" + chesisNo + '\'' +
                ", price=" + price +
                '}';
    }
}

