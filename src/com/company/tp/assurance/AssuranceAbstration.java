package com.company.tp.assurance;

import lombok.Data;

@Data
public abstract class AssuranceAbstration implements Garantie {

    private Garantie assurance;
    private Boolean aspect;

    public AssuranceAbstration(Garantie assurance, Boolean aspect) {
        this.assurance = assurance;
        this.aspect = aspect;
    }


    @Override
    public String info() {
        return assurance.info();
    }
}
