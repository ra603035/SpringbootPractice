package com.employee.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veichel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int veichelId;
    private String name;
    private String chesisNo;
    private float price;

    public Veichel() {
    }

    public Veichel(String name, String chesisNo, float price){
        this.name = name;
        this.chesisNo = chesisNo;
        this.price = price;
    }

    public int getVeichelId() {
        return veichelId;
    }

    public void setVeichelId(int veichelId) {
        this.veichelId = veichelId;
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
                "veichelId=" + veichelId +
                ", name='" + name + '\'' +
                ", chesisNo='" + chesisNo + '\'' +
                ", price=" + price +
                '}';
    }
}

