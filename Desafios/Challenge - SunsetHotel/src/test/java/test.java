import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.model.Guest;
import br.com.sunsethotel.model.Reservation;
import br.com.sunsethotel.model.Room;
import org.hibernate.cfg.MetadataSourceType;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class test {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        Guest henrizito = new Guest("Henrizito", "777.777.777-00", LocalDate.of(2000,1,26), "brasileiro", "(83) 99959-7989");

        em.persist(henrizito);

        Room room = new Room(222, "Suite", true);
        em.persist(room);

        Reservation res = new Reservation(henrizito, room, LocalDate.of(2023,8,26), LocalDate.of(2023,8,27), new BigDecimal(500), "Débito", "Giancarlo");

        em.persist(res);


        em.getTransaction().begin();
        em.getTransaction().commit();

    }
}
