package br.com.sunsethotel.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String email;
    private boolean administrator;
    private String cpf;
    private LocalDate birthDate;
    private int acessCode;
    private String userPassword;

    public User() {
    }

    public User(String name, String email, boolean admin, String cpf, LocalDate birthDate, int acessCode, String password) {
        this.userName = name;
        this.email = email;
        this.administrator = admin;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.acessCode = acessCode;
        this.userPassword = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAcessCode() {
        return acessCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
