package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {
    public static Room room = new Room numberOfBeds: 0, price: 100);

    @org.junit.jupiter.api.Test

    void checkIn() {
        room.checkIn();
        assertTrue (room.is0ccupied);



        Room roomTest = new Room(0,0);

        roomTest.checkIn();

        assertTrue(roomTest.isOccupied());
        assertTrue(roomTest.isDirty());
        assertFalse(roomTest.isAvailable());

    }

    @Test
    void checkOut_UnoccupiedandDirty_True() {

        Room roomTest = new Room(0,0);

        roomTest.checkIn();
        roomTest.checkout();

        assertFalse(roomTest.isOccupied());
        assertTrue(roomTest.isDirty());
        assertFalse(roomTest.isAvailable());

    }
    @Test
    void cleanRoom_CleanandMakeAvailable_True() {

        Room roomTest = new Room(0,0);

        roomTest.checkIn();
        roomTest.checkout();
        roomTest.cleanRoom();

        assertFalse(roomTest.isOccupied());
        assertFalse(roomTest.isDirty());
        assertTrue(roomTest.isAvailable());

    }
}