package com.company.flyweight;

public class Developer implements Employee{

    private String job;
    private String skill;
    public Developer(){
        this.job="fix the issue";
    }
    @Override
    public void assignSkill(String skill) {
        this.skill=skill;
    }

    @Override
    public void task() {
        System.out.println("the developer with skill : " +skill +" has the job "+job );
    }
}
