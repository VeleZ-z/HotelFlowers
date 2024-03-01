/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.hotel_flowers;

/**
 *
 * @author camilo.velez4
 */
public class Rooms {
    
    int numbRoom;
    int capRoom;
    int typeRoom;
    int bloqRoom;
    boolean state;
    int roomPhone;

    public Rooms() {
    }

    public Rooms(int numbRoom, int capRoom, int typeRoom, int bloqRoom, boolean state, int roomPhone) {
        this.numbRoom = numbRoom;
        this.capRoom = capRoom;
        this.typeRoom = typeRoom;
        this.bloqRoom = bloqRoom;
        this.state = state;
        this.roomPhone = roomPhone;
    }

    public int getNumbRoom() {
        return numbRoom;
    }

    public void setNumbRoom(int numbRoom) {
        this.numbRoom = numbRoom;
    }

    public int getCapRoom() {
        return capRoom;
    }

    public void setCapRoom(int capRoom) {
        this.capRoom = capRoom;
    }

    public int getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(int typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getBloqRoom() {
        return bloqRoom;
    }

    public void setBloqRoom(int bloqRoom) {
        this.bloqRoom = bloqRoom;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getRoomPhone() {
        return roomPhone;
    }

    public void setRoomPhone(int roomPhone) {
        this.roomPhone = roomPhone;
    }
    
    
}
