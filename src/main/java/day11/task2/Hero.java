package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;
    int health;
     double  physDef;
     double  magicDef;
     int  physAtt;

    public Hero() {
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt*(1 - hero.physDef);
        if(hero.health - attackScore <= MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }
}
