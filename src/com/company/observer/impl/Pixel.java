package com.company.observer.impl;

import lombok.Data;

@Data
public class Pixel {
    private int x,y;

    public Pixel(){

    }

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx,int dy){
        x+=dx;
        y+=dy;
    }
}
