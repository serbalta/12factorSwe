package com.swe.accountservice.entity;

public class Account {
    private String id;
    private String userName;
    private String eMail;
    private String passwrd;


    public Account(String id, String userName, String eMail, String passwrd) {
        this.id = id;
        this.userName = userName;
        this.eMail = eMail;
        this.passwrd = passwrd;

    }

    public Account() {
    }

    public Account(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }
}
