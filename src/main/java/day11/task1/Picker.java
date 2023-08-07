package day11.task1;

public class Picker implements Worker{
    final int SALARY = 80;
    private int salary;
    private boolean isPayed;
    private Warehouse wh;

    public Picker(int salary, boolean isPayed, Warehouse wh) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.wh = wh;
    }
    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }
    @Override
    public String toString() {
        return "Сборщик \n" +
                "Зарплата: " + salary +
                ", бонус: " + isPayed;
    }

    @Override
    public void doWork() {

            salary += SALARY;
            wh.incrementCountPickedOrders();

    }

    @Override
    public void bonus(Warehouse wh) {
        if (wh.getCountPickedOrders() < 10000 && !isPayed) {
                System.out.println("Бонус пока недоступен");
            } else if (wh.getCountPickedOrders() == 10000 && !isPayed) {
                salary += 70000;
                isPayed = true;
            } else {
            System.out.println("Бонус уже выплачен");
        }
    }
}

