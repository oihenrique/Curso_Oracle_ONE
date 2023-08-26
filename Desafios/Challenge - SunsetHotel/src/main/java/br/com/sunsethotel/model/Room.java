package br.com.sunsethotel.model;

import javax.persistence.*;

@Entity
@Table (name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;
    private int roomNumber;
    private String roomType;
    private boolean roomAvailability;

    public Room() {
    }

    public Room(int roomNumber, String roomType, boolean roomAvailability) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomAvailability = roomAvailability;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isRoomAvailability() {
        return roomAvailability;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomAvailability(boolean roomAvailability) {
        this.roomAvailability = roomAvailability;
    }
}
