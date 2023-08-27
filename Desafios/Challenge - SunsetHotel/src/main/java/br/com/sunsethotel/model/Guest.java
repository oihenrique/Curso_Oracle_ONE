package br.com.sunsethotel.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "guests")
public class Guest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guestId;
    private String guestName;
    private String cpf;
    private LocalDate birthDate;
    private String nationality;
    private String phoneNumber;

    @OneToMany(mappedBy = "guestName")
    private List<Reservation> reservations;

    public Guest() {
    }

    public Guest(String name, String cpf, LocalDate birthDate, String nationality, String phoneNumber) {
        this.guestName = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        this.reservations.remove(reservation);
    }

    public Integer getGuestId() {
        return guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Reservation> getGuestReservations() {
        return reservations;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
