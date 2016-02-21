package com.epam.ui.webdriver;

/**
 * @author kedr
 *
 *         Enumeration used browsers
 */
public enum DriverTypes {

    FIREFOX("firefox"), CHROME("chrome");

    private String driverName;

    private DriverTypes(String driverName) {
	this.driverName = driverName;
    }

    public String getDriverName() {
	return this.driverName;
    }

}
