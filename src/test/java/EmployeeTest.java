package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn_ClockInHasValue_True() {

        Employee employeeTest = new Employee("0","testName","test",0);

        employeeTest.punchIn();
        assertTrue(employeeTest.getClockIn() != 0);

    }

    @Test
    void punchOut_HoursWorkedHasValue_True() {
        //arrange
        Employee employeeTest = new Employee("0","testName","test",0);
        //act
        employeeTest.punchIn();
        employeeTest.punchOut();
        //assert
        assertTrue(employeeTest.getHoursWorked() != 0);
    }

    @Test
    void clockInOut_HoursWorkedHasValue_True() {
        //arrange
        Employee employeeTest = new Employee("0","testName","test",0);
        //act
        employeeTest.clockInOut();
        employeeTest.clockInOut();
        //assert
        assertTrue(employeeTest.getHoursWorked() != 0);
    }
}