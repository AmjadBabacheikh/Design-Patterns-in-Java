package com.company.tp.assurance;

public class Main {

    public static void main(String[] args) {
        Garantie assurance = new Assurance("responsability civile");
        System.out.println(assurance.info());
        Garantie incendieAssurance= new IncendieAssurance(assurance,true);
        System.out.println(incendieAssurance.info());
        Garantie volAssurance= new VolAssurance(incendieAssurance,true);
        System.out.println(volAssurance.info());
    }
}
