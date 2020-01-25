package com.it.users;

import java.util.ResourceBundle;

public class UserFactory {
    private static ResourceBundle resourceUser = ResourceBundle.getBundle("users");

    public static User getValidUser() {
        return new User(resourceUser.getString("username"),
                resourceUser.getString("password"),
                resourceUser.getString("email"));
    }
    /*public static User getRandomUser(){

    };*/
}
