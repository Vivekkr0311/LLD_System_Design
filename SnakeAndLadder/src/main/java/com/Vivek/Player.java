package com.Vivek;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Player {
    private int id;
    private String playerName;

    public Player(int id, String playerName){
        this.id = id;
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return this.playerName;
    }
}
