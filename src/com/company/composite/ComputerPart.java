package com.company.composite;

import java.util.ArrayList;
import java.util.List;

class Leaf implements Component {

    private String name;
    private int price;

    Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(this.name+" : "+this.price);
    }
}

class Composite implements Component {
    private String name;
    List<Component> componentList = new ArrayList<>();
    Composite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addComponent(Component c){
        componentList.add(c);
    }

    @Override
    public void showPrice() {
        System.out.println(this.name);
        for(Component c:componentList){
            c.showPrice();
        }
    }
}
