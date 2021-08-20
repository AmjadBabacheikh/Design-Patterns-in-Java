package com.company.adapter;

public class Demo {
    public static void main(String[] args) {
        Pen p = new PenAdapter();
        SchoolAssignement schoolAssignement=new SchoolAssignement();
        schoolAssignement.setP(p);
        schoolAssignement.doAssignement("i busy to do home works");
    }
}
