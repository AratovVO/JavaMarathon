package day11.task2;

public class Shaman extends Hero implements Healer,MagicAttack{
    static final int HEAL_AMOUNT = 50;
    static final int HEAL_TEAMATE_AMOUNT = 50;
    private int magicAtt;
    public Shaman(){
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt*(1 - hero.magicDef);
        if(hero.health - attackScore <= MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
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
        return "Shaman{health="+health+"}";
    }
}
