package br.com.sunsethotel.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rooms")
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;
    private Integer roomNumber;
    private String roomType;
    private boolean roomAvailability;

    public Room() {
    }

    public Room(Integer roomNumber, String roomType, boolean roomAvailability) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomAvailability = roomAvailability;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public Boolean isRoomAvailability() {
        return roomAvailability;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomAvailability(boolean roomAvailability) {
        this.roomAvailability = roomAvailability;
    }
}
