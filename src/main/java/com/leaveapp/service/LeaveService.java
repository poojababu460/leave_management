package com.leaveapp.service;
import com.leaveapp.model.Employee;

public class LeaveService {
    public boolean approveLeave(Employee emp, int days) {
        if (days <= emp.getBalance() && days > 0) {
            emp.setBalance(emp.getBalance() - days);
            return true; // Approved
        }
        return false; // Rejected
    }
}
