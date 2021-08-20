package com.company.flyweight;

public class Tester implements Employee {
    private String job;
    private String skill;
    public Tester (){
        this.job="test the issue";
    }
    @Override
    public void assignSkill(String skill) {
        this.skill=skill;
    }

    @Override
    public void task() {
        System.out.println("the tester with skill : " +skill +" has the job "+job );
    }
}
