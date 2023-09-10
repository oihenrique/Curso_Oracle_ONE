import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.model.Guest;
import br.com.sunsethotel.model.Reservation;
import br.com.sunsethotel.model.Room;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class connectionAndMappingTest {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        Guest henrizito = new Guest("Henrizito", "777.777.777-00", "brasileiro", "(83) 99959-7989");

        em.persist(henrizito);

        Room room = new Room(222, "Suite", true);
        em.persist(room);

        Reservation res = new Reservation(henrizito, room, LocalDate.of(2023, 8, 26), LocalDate.of(2023, 8, 27), new BigDecimal(200), "Débito");

        em.persist(res);

        em.getTransaction().begin();
        em.getTransaction().commit();

    }
}
