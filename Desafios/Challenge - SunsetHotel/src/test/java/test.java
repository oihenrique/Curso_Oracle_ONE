import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.model.Guest;
import org.hibernate.cfg.MetadataSourceType;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class test {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        String jpqa = "SELECT g FROM Guest g";
        List<Guest> guests = em.createQuery(jpqa, Guest.class).getResultList();

        for (Guest guest : guests) {
            System.out.println(guest.getGuestName());
        }
    }
}
