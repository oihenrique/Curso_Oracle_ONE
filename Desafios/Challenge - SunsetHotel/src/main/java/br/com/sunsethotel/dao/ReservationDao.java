package br.com.sunsethotel.dao;
import br.com.sunsethotel.model.Reservation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ReservationDao {

    public void registerReservation() {

    }

    public void cancelReservation() {

    }

    public boolean updateReservation(int reservationID, short roomNumber, LocalDate reservationDate, LocalDate expirationDate, BigDecimal reservationValue) {
        return true;
    }

//    public List<Reservation> searchReservation(int reservationID, short roomNumber, LocalDate reservationDate, LocalDate expirationDate){
//
//    }

//    public BigDecimal calculateReservationValue(short roomNumber, LocalDate reservationDate){
//
//    }
}
