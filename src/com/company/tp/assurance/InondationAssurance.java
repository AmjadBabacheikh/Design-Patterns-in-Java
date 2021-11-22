package com.company.tp.assurance;

import lombok.Data;


public class InondationAssurance extends AssuranceAbstration{


    public InondationAssurance(Garantie assurance, Boolean inondation) {
        super(assurance,inondation);
    }

    @Override
    public String info() {
        return super.info()+ " a l inondation " + this.getAspect();
    }
}
