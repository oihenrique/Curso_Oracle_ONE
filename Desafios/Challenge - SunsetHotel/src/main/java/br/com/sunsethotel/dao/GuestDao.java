package br.com.sunsethotel.dao;

import br.com.sunsethotel.model.Guest;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.Collections;
import java.util.List;

public class GuestDao {

    private final EntityManager dbConnection;

    public GuestDao(EntityManager dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void registerGuest(Guest guest) {
        dbConnection.persist(guest);
    }

    public void updateGuest(Guest guest, String guestName, String cpf, String phoneNumber) {
        if (guest != null) {
            if (guestName != null && !guestName.trim().isEmpty()) {
                guest.setGuestName(guestName);
            }
            if (cpf != null && !cpf.trim().isEmpty()) {
                guest.setCpf(cpf);
            }
            if (phoneNumber != null && !phoneNumber.trim().isEmpty()) {
                guest.setPhoneNumber(phoneNumber);
            }

            dbConnection.merge(guest);
        }
    }

    public void deleteGuest(Guest guest) {
        if (guest != null) {
            try {
                dbConnection.remove(dbConnection.find(Guest.class, guest.getGuestId()));
            } catch (RuntimeException e) {
                System.out.println("Guest not found");
            }
        }
    }

    public List<Guest> listAllGuests() {
        String selectAllGuests = "SELECT g FROM Guest g";

        try {
            return dbConnection.createQuery(selectAllGuests, Guest.class).getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }

    public List<Guest> searchGuestByName(String name) {
        String selectName = "SELECT g FROM Guest g WHERE g.guestName LIKE :guestName";

        try {
            return dbConnection.createQuery(selectName, Guest.class).setParameter("guestName", "%" + name + "%").getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }

    public Guest searchGuestByCpf(String cpf) {
        String selectName = "SELECT g FROM Guest g WHERE g.cpf = :cpf";

        try {
            return dbConnection.createQuery(selectName, Guest.class).setParameter("cpf", cpf).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
