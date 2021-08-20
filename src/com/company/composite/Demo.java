package com.company.composite;
/*
  Composite design pattern is a mechanism for treating individual object and compositions
  of objects in a uniform manner
 */
public class Demo {
    public static void main(String[] args) {

        Leaf hd = new Leaf("hard drive",5000);
        Leaf mouse = new Leaf("mouse",200);
        Leaf monitor = new Leaf("monitor",2000);
        Leaf ram = new Leaf("ram",400);
        Leaf cpu = new Leaf("cpu",4500);

        Composite ph = new Composite("peripheral");
        Composite mb = new Composite("mother board");
        Composite cabinet = new Composite("cabinet");
        Composite computer = new Composite("computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);
        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(mb);
        computer.addComponent(cabinet);
        computer.addComponent(ph);

        computer.showPrice();
    }
}
