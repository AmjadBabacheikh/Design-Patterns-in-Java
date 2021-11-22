package com.company.tp.assurance;

import lombok.Data;

@Data
public class Assurance implements Garantie {

    private String responsability;

    public Assurance(String responsability) {
        this.responsability = responsability;
    }

    @Override
    public String info() {
        return "l'assurance de " + this.responsability;
    }
}
