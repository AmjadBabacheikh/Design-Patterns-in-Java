package com.company.bridge;
//Bridge design pattern decouples an interface from an implementation
//without the bridge design pattern we will end up with RasterCircleRenderer
//VectorCircleRenderer,VectorSquareRenderer...
public class Demo {
    public static void main(String[] args) {
        VectorRenderer vector = new VectorRenderer();
        RasterRenderer raster = new RasterRenderer();
        Circle circle = new Circle(raster,10);
        circle.draw();
        circle.resize(5);
        circle.draw();
    }
}
