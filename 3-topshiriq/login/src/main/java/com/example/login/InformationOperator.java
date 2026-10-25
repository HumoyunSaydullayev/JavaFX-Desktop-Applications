package com.example.login;


public class InformationOperator {
    private String Login;
    private String Parol;

    public InformationOperator(String login,String parol) {
        this.Login = login;
        this.Parol = parol;
    }

    public void setLogin(String Login) {
        this.Login=Login;
    }

    public void setParol(String Parol) {
        this.Parol=Parol;
    }

    public String getLogin() {
        return Login;
    }

    public String getParol() {
        return Parol;
    }
}