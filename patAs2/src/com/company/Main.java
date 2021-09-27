package com.company;

public class Main {

    public static void main(String[] args) {
        SteamMarketPlace DotaMarketPlace = new SteamMarketPlace();
        DotaMarketPlace.addItem("Dragon Claw Hook");
        DotaMarketPlace.addItem("Phantom Assassin Arcana");
        DotaMarketPlace.addItem("Techies Arcana");
        DotaMarketPlace.notifySubscribers();

        SteamGamer gamer1 = new SteamGamer("vod_dm");
        SteamGamer gamer2 = new SteamGamer("Травоман");
        SteamGamer gamer3 = new SteamGamer();
        gamer3.setNickname("Miracle");

        DotaMarketPlace.addSubscriber(gamer1);
        DotaMarketPlace.addSubscriber(gamer2);
        DotaMarketPlace.addSubscriber(gamer3);

        System.out.println("After adding SF Arcana:");
        DotaMarketPlace.addItem("Shadow Fiend Arcana");
        DotaMarketPlace.notifySubscribers();
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("After removing DC Hook item:");
        DotaMarketPlace.removeItem("Dragon Claw Hook");
        DotaMarketPlace.notifySubscribers();
        System.out.println("");
        System.out.println("");
        System.out.println("");

        DotaMarketPlace.removeSubscriber(gamer1);

        System.out.println("After removing gamer1 subscriber and adding CM Arcana item:");
        DotaMarketPlace.addItem("CM Aghanim Scepter");
        DotaMarketPlace.notifySubscribers();
    }
}
