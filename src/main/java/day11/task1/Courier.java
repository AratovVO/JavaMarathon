package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse wh;

    public Courier(int salary, boolean isPayed, Warehouse wh) {
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
    public void doWork(){
        int SALARY = 100;
        salary+=SALARY;
        wh.incrementCountDeliveredOrders();
    }
    public void bonus(Warehouse wh){
        if (wh.getCountDeliveredOrders() < 10000 && !isPayed) {
            System.out.println("Бонус пока недоступен");
        } else if (wh.getCountDeliveredOrders() == 10000 && !isPayed) {
            salary += 50000;
            isPayed = true;
        } else {
            System.out.println("Бонус уже выплачен");
        }
    }
    @Override
    public String toString() {
        return "Курьер \n" +
                "Зарплата: " + salary +
                ", бонус: " + isPayed;
    }

}
