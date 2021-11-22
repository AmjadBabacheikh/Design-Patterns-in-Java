package com.company.observer.impl;
public class ObservateurDePoints extends ObservateurAbscisses {
    @Override
    public void actualise(AbscisseObservable p) {
        if (p instanceof Point) {
            System.out.println("Nouvelle abscisse " +
                    ((Point) p).getX() + "Nouvelle ordonne " +
                    ((Point) p).getY() + " dans le point de nom " + ((Point) p).getNom());
        }
    }
}
