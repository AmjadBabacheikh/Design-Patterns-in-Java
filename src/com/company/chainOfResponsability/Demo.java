package com.company.chainOfResponsability;

class Creature{
    public String name;
    public int attack;
    public int defence;


    Creature(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}

class CreatureModifier {

    protected Creature creature;
    public CreatureModifier next;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }
    public void add(CreatureModifier modifier){
        if(next!=null){
            next.add(modifier);
        }else{
            next=modifier;
        }
    }

    public void handle(){
        if(next!=null){
            next.handle();
        }
    }
}

class AttackModifier extends CreatureModifier{

    public AttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Double attack of "+creature.name);
        creature.attack *=2;
        super.handle();
    }
}

class DefenceModifier extends CreatureModifier{

    public DefenceModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Double Defence of "+creature.name);
        creature.defence *=2;
        super.handle();
    }
}

class NoBonusModifier extends CreatureModifier{

    public NoBonusModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("No bonus for you "+creature.name);
    }
}





public class Demo {
    public static void main(String[] args) {
        Creature naruto = new Creature("Naruto",50,20);
        System.out.println(naruto.toString());
        CreatureModifier cm = new CreatureModifier(naruto);
        /* cm.add(new NoBonusModifier(naruto));
        *  we could terminate the processing chain by invoking the NoBonusModifier
        * */
        cm.add(new AttackModifier(naruto));
        cm.add(new DefenceModifier(naruto));
        cm.handle();
        System.out.println(naruto.toString());
    }
}
