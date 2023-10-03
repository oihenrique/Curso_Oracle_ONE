package br.com.sunsethotel.dao;

import br.com.sunsethotel.model.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class UserDao {
    private final EntityManager dbConnection;

    public UserDao(EntityManager dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void createUser(User user) {
        if (user != null) {
            dbConnection.persist(user);
        }
    }

    public void updateUser(User user, String name, String email, Boolean admin, String cpf, String password) {
        if (user != null) {
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
    }

    public void deleteUser(User user) {
        if (user != null) {

            User managedUser = dbConnection.find(User.class, user.getUserId());
            try {
                dbConnection.remove(managedUser);
            } catch (RuntimeException e) {
                System.out.println("user not found");
            }
        }
    }

    public List<User> listAllUsers() {
        String selectAllUsers = "SELECT u FROM User u";

        try {
            return dbConnection.createQuery(selectAllUsers, User.class).getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }

    public List<User> searchByName(String name) {
        String selectName = "SELECT u FROM User u WHERE u.userName = :name";

        try {
            return dbConnection.createQuery(selectName, User.class).setParameter("name", name).getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }

    public User searchByAcessCode(Integer accessCode) {
        String selectAccessCode = "SELECT u FROM User u WHERE u.accessCode = :accessCode";

        try {
            return dbConnection.createQuery(selectAccessCode, User.class).setParameter("accessCode", accessCode).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public boolean authenticateUser(Integer accessCode, String password) {
        try {
            String selectHashedPassword = "SELECT u.userPassword FROM User u WHERE u.accessCode = :accessCode";
            String hashedPassword = dbConnection.createQuery(selectHashedPassword, String.class).setParameter("accessCode", accessCode).getSingleResult();
            return verifyPassword(password, hashedPassword);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int generateAcessCode() {
        int accessCode = new Random().nextInt(99999);

        String selectDBAcessCodeQuery = "SELECT accessCode FROM User";
        List<Integer> dbAcessCodeList = dbConnection.createQuery(selectDBAcessCodeQuery, Integer.class).getResultList();

        while (dbAcessCodeList.contains(accessCode)) {
            accessCode = new Random().nextInt(99999);
        }

        return accessCode;
    }

    public String generateHashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    public boolean verifyPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
