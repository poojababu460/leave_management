package com.leaveapp.model;
public class Employee {
    private String name;
    private int balance;
    public Employee(String name, int balance) { this.name = name; this.balance = balance; }
    public int getBalance() { return balance; }
    public void setBalance(int balance) { this.balance = balance; }
}
