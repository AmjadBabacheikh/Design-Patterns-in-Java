package com.company.tp.assurance;



public class DommageAssurance extends AssuranceAbstration{

    public DommageAssurance(Garantie assurance,Boolean aspect){
        super(assurance,aspect);
    }

    @Override
    public String info() {
        return super.info() + " a le dommage " + this.getAspect();
    }

}
