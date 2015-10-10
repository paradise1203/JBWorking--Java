package com.aidar;

public interface DAO {

    public UserInfo getUserInfo();

    public void addUserInfo(String fName, String sName, String lName, String bDate, Integer sex);

}
