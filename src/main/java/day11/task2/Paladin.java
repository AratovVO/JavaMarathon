package day11.task2;

public class Paladin extends Hero implements Healer {
    static final int HEAL_AMOUNT = 25;
    static final int HEAL_TEAMATE_AMOUNT = 10;
    public Paladin(){
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
            health += HEAL_AMOUNT;
            if(health >=100){
                health = 100;
            }
    }

    @Override
    public void healTeamate(Hero hero) {
        hero.health += HEAL_TEAMATE_AMOUNT;
        if(hero.health >= MAX_HEALTH){
            hero.health = MAX_HEALTH;
        }
    }
    public String toString(){
        return "Paladin{health="+health+"}";
    }
}
