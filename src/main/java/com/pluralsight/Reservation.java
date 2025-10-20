package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getReservationPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }
    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        switch (roomType){
            case "king":
                this.price = 139;
                break;
            case "double":
                this.price = 124;
                break;
        }
       this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        double reservationTotal = price*numberOfNights;
        if (isWeekend()){
            reservationTotal *= 1.1;
        }
        return reservationTotal;
    }

}


