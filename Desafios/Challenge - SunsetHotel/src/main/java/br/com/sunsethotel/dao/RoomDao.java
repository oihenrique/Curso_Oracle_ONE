package br.com.sunsethotel.dao;

import br.com.sunsethotel.model.Room;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
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

    public void deleteRoom(Integer roomId) {
        dbConnection.remove(dbConnection.find(Room.class, roomId));
    }

    public List<Room> listRooms() {
        String selectAllRooms = "SELECT r FROM Room r";
        return dbConnection.createQuery(selectAllRooms, Room.class).getResultList();
    }

    public Room searchByRoomNumber(Integer roomNumber) {
        Room room;
        String selectRoomNumber = "SELECT r FROM Room r WHERE r.roomNumber = :roomNumber";

        try {
            room = dbConnection.createQuery(selectRoomNumber, Room.class).setParameter("roomNumber", roomNumber).getSingleResult();
        } catch (NoResultException e) {
            room = null;
        }

        return room;
    }
}
