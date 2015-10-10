package com.aidar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImpl implements DAO {

    @Autowired
    UserInfo userInfo;

    @Override
    public UserInfo getUserInfo() {
        return userInfo;
    }

    @Override
    public void addUserInfo(String fName, String sName, String lName, String bDate, Integer sex) {
        userInfo.setFirstName(fName);
        userInfo.setSecondName(sName);
        userInfo.setLastName(lName);
        if (bDate != null) {
            userInfo.setBirthDate(bDate);
        }
        if (sex == null) {
            sex = 0;
        }
        userInfo.setSex(Sex.getSex(sex));
    }

}
