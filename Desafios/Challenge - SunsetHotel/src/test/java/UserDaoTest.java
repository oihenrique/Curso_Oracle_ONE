import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.UserDao;
import br.com.sunsethotel.model.User;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class UserDaoTest {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        UserDao userDao = new UserDao(em);

        User user1 = new User("Giancarlo R.", "giancarlo.mail@gmail.com", true, "333.333.333-00", LocalDate.of(1990, 1, 31), "he123456");

        userDao.createUser(user1);

        User user = em.createQuery("SELECT u FROM User u WHERE acessCode = :aCode", User.class).setParameter("aCode", 19362).getSingleResult();
        //user.setEmail("user.mail@sunsethotel.com");

        userDao.updateUser(user, "", null, null, null, "henri123456");
        System.out.println(userDao.authenticateUser(user, 19362, "h123456"));
        userDao.deleteUser(user.getUserId());

        for (User users : userDao.listAllUsers()) {
            System.out.println(users.getUserName());
        }

        for (User users : userDao.searchByName("Henrique")) {
            System.out.println(users.getAcessCode());
        }

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}
