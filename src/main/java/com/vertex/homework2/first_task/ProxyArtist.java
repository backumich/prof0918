package com.vertex.homework2.first_task;

import com.vertex.homework2.first_task.figures.Figure;

public class ProxyArtist implements Figure {

    Artist delegat;

    public ProxyArtist(){
        this.delegat = new Artist();
    }

    @Override
    public void draw(int amount) {
        System.out.println("We need to summon ziggurat!");
        delegat.draw(amount);
    }
}