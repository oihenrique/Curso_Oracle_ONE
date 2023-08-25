package br.com.sunsethotel.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationID;
    private short roomNumber;
    private LocalDate reservationDate;
    private LocalDate expirationDate;
    private BigDecimal reservationValue;
    private String paymentMethod;
    private String insertedBy;

    public Reservation(){}

    public Reservation(short roomNumber, LocalDate reservationDate, LocalDate expirationDate, BigDecimal reservationValue, String paymentMethod, String insertedBy) {
        this.roomNumber = roomNumber;
        this.reservationDate = reservationDate;
        this.expirationDate = expirationDate;
        this.reservationValue = reservationValue;
        this.paymentMethod = paymentMethod;
        this.insertedBy = insertedBy;
    }

    public int getReservationID() {
        return reservationID;
    }

    public short getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public BigDecimal getReservationValue() {
        return reservationValue;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getInsertedBy() {
        return insertedBy;
    }

    public void setRoomNumber(short roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setReservationValue(BigDecimal reservationValue) {
        this.reservationValue = reservationValue;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}