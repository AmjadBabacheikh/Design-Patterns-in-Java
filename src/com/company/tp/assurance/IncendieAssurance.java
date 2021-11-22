package com.company.tp.assurance;



public class IncendieAssurance extends AssuranceAbstration{

    public IncendieAssurance(Garantie assurance,Boolean aspect){
        super(assurance,aspect);
    }

    @Override
    public String info() {
        return super.info()+ " a l incendie " + this.getAspect();
    }
}
