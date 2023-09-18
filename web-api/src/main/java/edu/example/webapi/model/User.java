package edu.example.webapi.model;

import javax.annotation.processing.Generated;

public class User {
    private Integer id;
    private String login;
    private String password;
    public User() {}

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, Integer id) {
        this.login = login;
        this.password = password;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
