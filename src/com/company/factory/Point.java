package com.company.factory;

public class Point {
    private double x;
    private double y;


    private Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public static class factory {
        //factory method for cartesian point
        public static Point newCartesianPoint(double x,double y){
            return new Point(x,y);
        }
        //factory method for polar point
        public static Point newPolarPoint(double rho,double theta){
            return new Point(rho*Math.cos(theta),rho*Math.sin(theta));
        }
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Demo {
    public static void main(String[] args) {
        Point p1=Point.factory.newCartesianPoint(2,3);
        System.out.println(p1.toString());
    }
}
