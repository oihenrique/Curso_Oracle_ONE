package br.com.sunsethotel.dao;

import br.com.sunsethotel.model.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Random;

public class UserDao {
    private final EntityManager dbConnection;

    public UserDao(EntityManager dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void createUser(User user) {
        dbConnection.persist(user);
    }

    public void updateUser(User user, String name, String email, Boolean admin, String cpf, String password) {
        if (name != null && !name.trim().isEmpty()) {
            user.setUserName(name);
        }
        if (email != null && !email.trim().isEmpty()) {
            user.setEmail(email);
        }
        if (admin != null) {
            user.setAdministrator(admin);
        }
        if (cpf != null && !cpf.trim().isEmpty()) {
            user.setCpf(cpf);
        }
        if (password != null && !password.trim().isEmpty()) {
            String newPassword = generateHashPassword(password);
            user.setUserPassword(newPassword);
        }

        dbConnection.merge(user);
    }

    public void deleteUser(Integer userId) {
        dbConnection.remove(dbConnection.find(User.class, userId));
    }

    public List<User> listAllUsers() {
        String selectAllUsers = "SELECT u FROM User u";
        return dbConnection.createQuery(selectAllUsers, User.class).getResultList();
    }

    public List<User> searchByName(String name) {
        String selectName = "SELECT u FROM User u WHERE u.userName = :name";
        return dbConnection.createQuery(selectName, User.class).setParameter("name", name).getResultList();
    }

    public boolean authenticateUser(User user, Integer acessCode, String password) {
        String selectDBAcessCode = "SELECT u.acessCode FROM User u WHERE u.userId = :id";
        Integer dbAcessCode = dbConnection.createQuery(selectDBAcessCode, Integer.class).setParameter("id", user.getUserId()).getSingleResult();

        String selectDBPassword = "SELECT u.userPassword FROM User u WHERE u.userId = :id";
        String hashedPassword = dbConnection.createQuery(selectDBPassword, String.class).setParameter("id", user.getUserId()).getSingleResult();

        if (acessCode.equals(dbAcessCode)) {
            return verifyPassword(password, hashedPassword);
        }
        return false;
    }

    public int generateAcessCode() {
        int acessCode = new Random().nextInt(99999);

        String selectDBAcessCodeQuery = "SELECT acessCode FROM User";
        List<Integer> dbAcessCodeList = dbConnection.createQuery(selectDBAcessCodeQuery, Integer.class).getResultList();

        while (dbAcessCodeList.contains(acessCode)) {
            acessCode = new Random().nextInt(99999);
        }

        return acessCode;
    }

    public String generateHashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    public boolean verifyPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
