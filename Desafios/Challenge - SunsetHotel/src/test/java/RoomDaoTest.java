import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.RoomDao;
import br.com.sunsethotel.model.Room;

import javax.persistence.EntityManager;

public class RoomDaoTest {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        RoomDao roomDao = new RoomDao(em);

        Room room = new Room(300, "Couple Room", true);
        Room room1 = new Room(301, "Couple Room", true);
        Room room2 = new Room(302, "Couple Room", true);
        Room room3 = new Room(303, "Couple Room", true);
        Room room4 = new Room(304, "Couple Room", true);

        roomDao.registerRoom(room);
        roomDao.registerRoom(room1);
        roomDao.registerRoom(room2);
        roomDao.registerRoom(room3);
        roomDao.registerRoom(room4);

        Room roomFromDB = roomDao.searchByRoomNumber(200);

        roomDao.updateRoom(roomFromDB, null, null, false);

        //roomDao.deleteRoom(roomFromDB.getRoomId());

        for (Room rooms : roomDao.listRooms()) {
            System.out.println(rooms.getRoomNumber());
        }

        Room roomSearch = roomDao.searchByRoomNumber(200);
        System.out.println(roomSearch.isRoomAvailability());

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}
