package com.cykj.auc.bean;

public class UserInfo {
    private int Id;
    private String account;
    private String pwd;


    public UserInfo() {
    }

    public UserInfo(int id, String account, String pwd) {
        Id = id;
        this.account = account;
        this.pwd = pwd;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
