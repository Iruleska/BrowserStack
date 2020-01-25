package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test() {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLblUserEmail(), validUser.email);
    }
}
