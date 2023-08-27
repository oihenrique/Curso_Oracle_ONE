package br.com.sunsethotel.model;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.RoomDao;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "reservations")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationID;
    private LocalDate reservationDate;
    private LocalDate expirationDate;
    private BigDecimal reservationValue;
    private String paymentMethod;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "guestName", referencedColumnName = "guestName")
    private Guest guestName;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "roomNumber", referencedColumnName = "roomNumber")
    private Room roomNumber;

    public Reservation() {
    }

    public Reservation(Guest guest, Room roomNumber, LocalDate reservationDate, LocalDate expirationDate, String paymentMethod) {
        this.roomNumber = roomNumber;
        this.reservationDate = reservationDate;
        this.expirationDate = expirationDate;
        this.paymentMethod = paymentMethod;
        this.guestName = guest;
    }

    public int getReservationID() {
        return reservationID;
    }

    public Room getRoom() {
        return this.roomNumber;
    }

    public int getRoomNumber() {
        return this.roomNumber.getRoomNumber();
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


    public Guest getGuest() {
        return guestName;
    }

    public void setRoom(Integer number) {
        this.roomNumber = new RoomDao(JPAUtil.getEntityManager()).searchByRoomNumber(number);
    }

    public void setRoomNumber(Integer number) {
        this.roomNumber.setRoomNumber(number);
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