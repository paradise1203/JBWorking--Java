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
    public void addUserInfo(String fName, String sName, String lName, String bDate, String sex) {
        userInfo.setFirstName(fName);
        userInfo.setSecondName(sName);
        userInfo.setLastName(lName);
        if (bDate != null) {
            userInfo.setBirthDate(bDate);
        }
        if (sex != null) {
            if (sex.equals("male")) {
                userInfo.setSex(Sex.MALE);
            } else {
                userInfo.setSex(Sex.FEMALE);
            }
        }
    }

}
