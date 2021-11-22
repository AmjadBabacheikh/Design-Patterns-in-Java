package com.company.observer.impl;


public class Test {
    public static void main(String[] args) {
        ObservateurDePoints obsPoints = new ObservateurDePoints();
        Point p1 = new Point(2,4,"p1");
        Point p2 = new Point(1,2,"p2");
        p1.enregistre(obsPoints);
        p2.enregistre(obsPoints);
        p1.deplace(2,5);
        p2.deplace(4,8);
    }
}
