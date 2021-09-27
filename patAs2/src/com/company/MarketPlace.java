package com.company;

public interface MarketPlace {
    void addSubscriber(Gamer gamer);
    void removeSubscriber(Gamer gamer);
    void notifySubscribers();
}
