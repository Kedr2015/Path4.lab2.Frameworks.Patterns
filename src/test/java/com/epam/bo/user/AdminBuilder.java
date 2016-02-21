package com.epam.bo.user;

public class AdminBuilder extends BaseBuilder {

    @Override
    public void buldLogin() {
	user.setLogin("epamtestselenium");

    }

    @Override
    public void buldPassword() {
	user.setPassword("TestEPAM1");

    }

}
