package com.company._01_creational_patterns._02_factorymethod._02_after;

public class Client {

    public static void main(String[] args) {
//        Ship whiteShip = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
//
//        System.out.println("whiteShip = " + whiteShip);
//
//        Ship blackShip = ShipFactory.orderShip("Blackship", "keesun@mail.com");
//
//        System.out.println("blackShip = " + blackShip);
        Client client = new Client();

        client.print(new WhiteshipFactory(), "whiteship", "keesun@mail.com");

        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println("whiteship = " + whiteship);
        
        Ship blackship = new BlackshipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println("blackship = " + blackship);

    }

    private void print(ShipFactory shipFactory, String name, String email) {
    }
}
