package com.company._01_creational_patterns._02_factorymethod._01_before;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("Whiteship", "keesun@mail.com");

        System.out.println("whiteShip = " + whiteShip);

        Ship blackShip = ShipFactory.orderShip("Blackship", "keesun@mail.com");

        System.out.println("blackShip = " + blackShip);
    }
}
