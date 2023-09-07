import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.GuestDao;

import br.com.sunsethotel.model.Guest;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class GuestDaoTest {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        GuestDao guestDao = new GuestDao(em);

        Guest guest = new Guest("Fernado", "222-222-222-00", "Brasileiro", "(11) 99999-9999");
        Guest guest1 = new Guest("Fernado Noronha", "222-222-222-01", "Brasileiro", "(11) 99999-9999");
        Guest guest2 = new Guest("Carla", "222-222-222-02", "Brasileira", "(11) 99999-9999");

        guestDao.registerGuest(guest);
        guestDao.registerGuest(guest1);
        guestDao.registerGuest(guest2);

        Guest guest3 = guestDao.searchGuestByCpf("222-222-222-02");

        guestDao.updateGuest(guest3, "", "", "(11) 98888-8888");

        for (Guest guests : guestDao.listAllGuests()) {
            System.out.println(guests.getGuestName());
        }

        for (Guest guests : guestDao.searchGuestByName("Fernado")) {
            System.out.println(guests.getGuestName());
        }

        for (Guest guests : guestDao.listAllGuests()) {
            System.out.println(guests.getGuestName());
        }

        //guestDao.deleteGuest(guest);

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}
