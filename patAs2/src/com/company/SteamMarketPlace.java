package com.company;

import java.util.ArrayList;
import java.util.List;

public class SteamMarketPlace implements MarketPlace{

    private List<String> items = new ArrayList<>();
    private List<Gamer> gamers = new ArrayList<>();

    public void addItem(String item){
        this.items.add(item);
    }

    public void removeItem(String item){
        this.items.remove(item);
    }

    @Override
    public void addSubscriber(Gamer gamer) {
        this.gamers.add(gamer);
    }

    @Override
    public void removeSubscriber(Gamer gamer) {
        this.gamers.remove(gamer);
    }

    @Override
    public void notifySubscribers() {
        for (Gamer gamer: gamers){
            gamer.update(this.items);
        }
    }
}
