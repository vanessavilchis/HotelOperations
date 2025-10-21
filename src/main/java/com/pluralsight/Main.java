package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(2, 124.00, false, false);
        System.out.println("   Number of Beds: " + room1.getNumberOfBeds());
        System.out.println("   Price: $" + room1.getPrice());
        System.out.println("   Occupied: " + room1.isOccupied());
        System.out.println("   Dirty: " + room1.isDirty());
        System.out.println("   Available: " + room1.isAvailable() + " ✅");
        System.out.println();

        //139 king

    public static void main(String[] args) {
        Reservation r = new Reservation("King", 40, true);

        System.out.println(r.getReservationTotal());

        Room room = new Room(4, true, true, r.getReservationTotal());
    }
}