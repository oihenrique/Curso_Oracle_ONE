import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.GuestDao;
import br.com.sunsethotel.dao.ReservationDao;
import br.com.sunsethotel.dao.RoomDao;
import br.com.sunsethotel.model.Guest;
import br.com.sunsethotel.model.Reservation;
import br.com.sunsethotel.model.Room;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class ReservationDaoTest {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        ReservationDao reservationDao = new ReservationDao(em);

        Room room = new RoomDao(em).searchByRoomNumber(301);
        Room room1 = new RoomDao(em).searchByRoomNumber(302);

        Guest guest = new GuestDao(em).searchGuestByCpf("222-222-222-00");
        Guest guest1 = new GuestDao(em).searchGuestByCpf("222-222-222-02");

        Reservation reservation = new Reservation(guest, room, LocalDate.of(2023, 8, 26), LocalDate.of(2023, 8, 28), new BigDecimal(200), "Cartão");
        Reservation reservation1 = new Reservation(guest1, room1, LocalDate.of(2023, 8, 26), LocalDate.of(2023, 8, 28), new BigDecimal(200), "Cartão");

        reservationDao.registerReservation(reservation);
        reservationDao.registerReservation(reservation1);

        List<Reservation> reservation2 = reservationDao.searchReservationsByGuest(guest);
//        reservationDao.cancelReservation(reservation2.get(0));

        reservationDao.updateReservation(reservation2.get(0), 303, null, null);

        reservationDao.updateReservation(reservation2.get(0), null, LocalDate.of(2023, 8, 25), LocalDate.of(2023, 8, 28));

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}
