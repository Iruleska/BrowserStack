package com.it.tests;

import com.it.App;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {
    static protected App app = new App();
    static protected User  validUser = UserFactory.getValidUser();

    @AfterSuite
    public void tearDownSuite() {
        app.common.stopApp();
    }
}
