package br.com.sunsethotel.dao;

import br.com.sunsethotel.model.Guest;
import br.com.sunsethotel.model.Reservation;
import br.com.sunsethotel.model.Room;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

public class ReservationDao {
    private final EntityManager dbConnection;

    public ReservationDao(EntityManager dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void registerReservation(Reservation reservation) {
        if (reservation != null) {
            dbConnection.persist(reservation);

            Room room = new RoomDao(dbConnection).searchByRoomNumber(reservation.getRoomNumber());
            room.setRoomAvailability(false);

            Guest guest = reservation.getGuest();

            guest.addReservation(reservation);
        }
    }

    public void cancelReservation(Reservation reservation) {
        if (reservation != null) {
            Reservation managedReservation = dbConnection.find(Reservation.class, reservation.getReservationID());

            try {
                Room room = new RoomDao(dbConnection).searchByRoomNumber(reservation.getRoomNumber());
                room.setRoomAvailability(true);

                Guest guest = reservation.getGuest();
                guest.removeReservation(reservation);

                dbConnection.remove(managedReservation);
            } catch (RuntimeException e) {
                System.out.println("Reservation not found");
            }
        }
    }

    public void updateReservation(Reservation reservation, Integer roomNumber, LocalDate reservationDate, LocalDate expirationDate) {
        if (reservation != null) {
            long daysDifference = ChronoUnit.DAYS.between(reservation.getReservationDate(), reservation.getExpirationDate());

            if (roomNumber != null) {
                RoomDao roomDao = new RoomDao(dbConnection);
                Room room = roomDao.searchByRoomNumber(reservation.getRoom().getRoomNumber());
                room.setRoomAvailability(true);

                Room newRoom = roomDao.searchByRoomNumber(roomNumber);
                newRoom.setRoomAvailability(false);

                reservation.setRoom(roomNumber);
            }

            if (reservationDate != null && expirationDate != null && daysDifference > 0) {
                reservation.setReservationDate(reservationDate);
                reservation.setExpirationDate(expirationDate);
                reservation.setReservationValue(calculateReservationValue(reservationDate, expirationDate));
            }

            dbConnection.merge(reservation);
        }
    }

    public List<Reservation> listAllReservations() {
        String selectAll = "SELECT r FROM Reservation r";
        try {
            return dbConnection.createQuery(selectAll, Reservation.class).getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }

    public List<Reservation> searchReservationsByGuest(Guest guest) {
        return guest.getGuestReservations();
    }

    public List<Reservation> searchReservationByGuestName(String name) {
        String selectReservation = "SELECT r FROM Reservation r WHERE r.guestName LIKE :name";
        try {
            return dbConnection.createQuery(selectReservation, Reservation.class).setParameter("guestName", "%" + name + "%").getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }
   
    public BigDecimal calculateReservationValue(LocalDate reservationDate, LocalDate expirationDate) {
        long daysDifference = ChronoUnit.DAYS.between(reservationDate, expirationDate);

        int days = (int) daysDifference;
        return new BigDecimal(150 * days);
    }
}
