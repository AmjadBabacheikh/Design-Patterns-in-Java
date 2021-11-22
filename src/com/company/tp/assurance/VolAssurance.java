package com.company.tp.assurance;




public class VolAssurance extends AssuranceAbstration{

    public VolAssurance(Garantie assurance, Boolean vol) {
        super(assurance,vol);
    }


    @Override
    public String info() {
        return super.info()+ " a le vol " + this.getAspect();
    }
}
