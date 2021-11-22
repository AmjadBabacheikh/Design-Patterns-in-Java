package com.company.observer.impl;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Point extends Pixel implements AbscisseObservable {
    private String nom;
    private List<ObservateurAbscisses> observateurAbscisses;

    public Point(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
        observateurAbscisses = new ArrayList<>();
    }

    @Override
    public void enregistre(ObservateurAbscisses obs) {
        observateurAbscisses.add(obs);
    }

    @Override
    public void prevenir() {
        for(ObservateurAbscisses obs:observateurAbscisses){
            obs.actualise(this);
        }
    }

    @Override
    public void deplace(int dx, int dy) {
        super.deplace(dx, dy);
        if (dx != 0) prevenir();
    }
}
