package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Paladin paladin = new Paladin();
        Warrior warrior = new Warrior();
        Shaman shaman = new Shaman();
        Magician magician = new Magician();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeamate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);

        for (int i = 0; i<5;i++){
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }

    }
}
