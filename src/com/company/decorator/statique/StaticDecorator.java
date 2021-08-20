package com.company.decorator.statique;

import java.util.function.Supplier;

interface Shape {
    String info();
}

class Circle implements Shape{
    private double radius;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    void resize(Float factor){
        radius*=factor;
    }
    @Override
    public String info() {
        return "A circle with radius of "+this.radius;
    }
}
class Square implements Shape{
    private double side;
    public Square(){

    }
    public Square(double side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "a square with side of: "+side;
    }
}

class ColoredShape<T extends Shape> implements Shape{

    private Shape shape;
    private String color;

    ColoredShape(Supplier<? extends T> constr , String color) {
        this.shape = constr.get();
        this.color = color;
    }


    @Override
    public String info() {
        return shape.info() + " has the color "+this.color;
    }
}
class TransparentShape<T extends Shape> implements Shape{
    private Shape shape;
    private int transparency;

    TransparentShape(Supplier<? extends T> constr, int transparency) {
        this.shape = constr.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has the transparency of % "+this.transparency;
    }
}

class Demo2{
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println(circle.info());

        ColoredShape<Square> square = new ColoredShape<>(
                ()->new Square(5),"Blue"
        );
        System.out.println(square.info());

        TransparentShape<Circle> transparentShape = new TransparentShape<>(
                ()->new Circle(8),20);
        System.out.println(transparentShape.info());
    }

}
