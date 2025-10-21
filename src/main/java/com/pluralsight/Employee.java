package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked;
    private double punchInTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchInTime = 0.0;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        double regularPay = this.payRate * this.getRegularHours();
        double overtimePay = (this.payRate * 1.5) * this.getOvertimeHours();
        return regularPay + overtimePay;
    }


    public double getRegularHours() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }
    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }
    public void punchIn(double time) {
        this.punchInTime = time;

    }

    public void punchOut(double time) {
        double hoursThisShift = time - this.punchInTime;
        this.hoursWorked += hoursThisShift;
        this.punchInTime = 0.0;
    }

    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();

        double time = hour + (minute/60.0);
        this.punchIn(time);
    }
    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();

        int hour = now.getHour();
        int minute = now.getMinute();

        double time = hour + (minute/60.0);

        this.punchOut(time);
    }
}
