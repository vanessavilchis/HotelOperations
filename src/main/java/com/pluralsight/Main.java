package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(2, 124.00, false, false);
        System.out.println("   Number of Beds: " + room1.getNumberOfBeds());
        System.out.println("   Price: $" + room1.getPrice());
        System.out.println("   Occupied: " + room1.isOccupied());
        System.out.println("   Dirty: " + room1.isDirty());
        System.out.println("   Available: " + room1.isAvailable() + "Available!");
        System.out.println();

        //139 king

        Employee emp = new Employee(1, "Maria", "Front Desk", 20, 0.0);

        System.out.println("   Employee: " + emp.getName());
        System.out.println("   Department: " + emp.getDepartment());
        System.out.println("   Pay Rate: $" + emp.getPayRate() + "/hour");
        System.out.println("   Initial Hours: " + emp.getHoursWorked());
        System.out.println();

    }
}