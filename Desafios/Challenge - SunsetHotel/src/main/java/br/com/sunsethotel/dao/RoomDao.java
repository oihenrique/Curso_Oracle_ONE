package br.com.sunsethotel.dao;

import br.com.sunsethotel.model.Guest;
import br.com.sunsethotel.model.Room;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.Collections;
import java.util.List;

public class RoomDao {

    private final EntityManager dbConnection;

    public RoomDao(EntityManager dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void registerRoom(Room room) {
        dbConnection.persist(room);
    }

    public void updateRoom(Room room, Integer roomNumber, String roomType, Boolean roomAvailability) {
        if (room != null) {
            if (roomNumber != null) {
                room.setRoomNumber(roomNumber);
            }
            if (roomType != null && !roomType.trim().isEmpty()) {
                room.setRoomType(roomType);
            }
            if (roomAvailability != null) {
                room.setRoomAvailability(roomAvailability);
            }

            dbConnection.merge(room);
        }
    }

    public void deleteRoom(Guest guest) {
        if (guest != null) {
            try {
                dbConnection.remove(dbConnection.find(Room.class, guest.getGuestId()));
            } catch (RuntimeException e) {
                System.out.println("Room not found");
            }
        }
    }

    public List<Room> listRooms() {
        String selectAllRooms = "SELECT r FROM Room r";
        try {
            return dbConnection.createQuery(selectAllRooms, Room.class).getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }

    public Room searchByRoomNumber(Integer roomNumber) {
        String selectRoomNumber = "SELECT r FROM Room r WHERE r.roomNumber = :roomNumber";

        try {
            return dbConnection.createQuery(selectRoomNumber, Room.class).setParameter("roomNumber", roomNumber).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
