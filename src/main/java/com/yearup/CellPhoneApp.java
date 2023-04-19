package com.yearup;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("1000000-9999999", "iPhone", "AT&T",
                "800-555-5555", "Dana Wyatt");
        System.out.printf("%s has %s", cellPhone1.getOwner(),cellPhone1.getCarrier());
    }
}
