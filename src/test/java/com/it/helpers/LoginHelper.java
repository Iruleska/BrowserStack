package com.it.helpers;

import com.it.pages.LoginPage;
import com.it.users.User;

public class LoginHelper extends LoginPage {
    public void login(User user) {
        login(user.username, user.password);
    }
}
