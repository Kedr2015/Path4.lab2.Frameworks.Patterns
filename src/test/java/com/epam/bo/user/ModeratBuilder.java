package com.epam.bo.user;

public class ModeratBuilder extends BaseBuilder {

    @Override
    public void buldLogin() {
	user.setLogin("TestError");

    }

    @Override
    public void buldPassword() {
	user.setPassword("TestError");

    }

}
