package com.leaveapp.service;
import com.leaveapp.model.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeaveServiceTest {
    LeaveService service = new LeaveService();

    @Test
    void testApprovalSuccess() {
        Employee emp = new Employee("Alice", 10);
        assertTrue(service.approveLeave(emp, 5));
        assertEquals(5, emp.getBalance());
    }

    @Test
    void testRejectionInsufficientBalance() {
        Employee emp = new Employee("Bob", 5);
        assertFalse(service.approveLeave(emp, 10));
        assertEquals(5, emp.getBalance());
    }
}
