package com.bean;

import java.io.Serializable;

/**
 * Account
 *
 * @author jiajunkang
 * @version 1.0.0
 **/
public class Account implements Serializable{
    private int id;
    private String name;

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private double money;
}
