package com.company.decorator.dynamique;

interface Shape {
    String info();
}

class Circle implements Shape {
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
class Square implements Shape {
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

class ColoredShape implements Shape {

    private Shape shape;
    private String color;

    ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }


    @Override
    public String info() {
        return shape.info() + " has the color "+this.color;
    }
}
class TransparentShape implements Shape {
    private Shape shape;
    private int transparency;

    TransparentShape(Shape shape, int transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has the transparency of % "+this.transparency;
    }
}

class Demo1{
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println(circle.info());

        ColoredShape coloredShape= new ColoredShape(
                new Square(10),"Green"
        );
        System.out.println(coloredShape.info());
        TransparentShape transparentShape=new TransparentShape(
                coloredShape,30
        );
        System.out.println(transparentShape.info());
    }

}

