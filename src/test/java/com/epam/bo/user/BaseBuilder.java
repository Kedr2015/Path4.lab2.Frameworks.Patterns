package com.epam.bo.user;

public abstract class BaseBuilder {
    protected User user = new User();

    public User getUser() {
	return user;
    }
    
    public abstract void buldLogin();
    public abstract void buldPassword();
}
