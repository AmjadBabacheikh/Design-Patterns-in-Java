package com.company.adapter;

public class SchoolAssignement {
    private Pen p;

    public Pen getP() {
        return p;
    }
    public void setP(Pen p) {
        this.p = p;
    }
    public void doAssignement(String str){
        p.write(str);
    }
}
