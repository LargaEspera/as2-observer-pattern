package com.company;

import java.util.List;

public class SteamGamer implements Gamer{

    private String nickname;
    public SteamGamer(String nickname){
        this.nickname = nickname;
    }

    public SteamGamer(){

    }

    @Override
    public void update(List<String> items) {
        System.out.println(this.nickname + ". Marketplace is updated. Items available for purchase: " + items);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
