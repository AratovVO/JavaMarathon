package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public Warehouse(int countPickedOrders, int countDeliveredOrders) {
        this.countPickedOrders = 0;
        this.countDeliveredOrders = 0;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void incrementCountPickedOrders() {
        countPickedOrders++;
    }
    public void incrementCountDeliveredOrders(){
        countDeliveredOrders++;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    @Override
    public String toString() {
        return "Склад \n" +
                "Количество собранных заказов: " + countPickedOrders +
                ", количество доставленных заказов: " + countDeliveredOrders;
    }
}
