package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(0,false,warehouse1);
//        Courier courier2 = new Courier(0,false,warehouse1);
        Picker picker1 = new Picker(0,false,warehouse1);
//        Picker picker2 = new Picker(0,false,warehouse1);

//        int i = warehouse1.getCountPickedOrders();
//        for(i = 0; i < 5000; i++){
//            picker1.doWork();
//        }
//        System.out.println(picker1);
//        picker1.bonus(warehouse1);
//        System.out.println(picker1);
//        System.out.println(warehouse1+ "\n");
//
//        for (i = 0; i < 5000; i++){
//            picker2.doWork();
//        }
//        System.out.println(picker2);
//        System.out.println(warehouse1);
//        picker1.bonus(warehouse1);
//        picker2.bonus(warehouse1);
//        System.out.println("\n"+picker1);
//        System.out.println("\n"+picker2);
//        picker1.bonus(warehouse1);
//        picker2.bonus(warehouse1);
//        System.out.println("\n"+picker1);
//        System.out.println("\n"+picker2);
//
//
//        int i = warehouse1.getCountDeliveredOrders();
//
//        for(i = 0; i < 5000; i++){
//            courier1.doWork();
//        }
//        System.out.println(courier1);
//        System.out.println(warehouse1);
//        courier1.bonus(warehouse1);
//
//        for (i = 0; i < 5000; i++){
//            courier2.doWork();
//        }
//        System.out.println(courier2);
//        System.out.println(warehouse1);
//
//
//        courier1.bonus(warehouse1);
//        courier2.bonus(warehouse1);
//
//
//        System.out.println("\n"+courier1);
//        System.out.println("\n"+courier2);
//        courier1.bonus(warehouse1);
//        courier2.bonus(warehouse1);
//        System.out.println("\n"+courier1);
//        System.out.println("\n"+courier2);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println(warehouse1);

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(0,false,warehouse2);
        Picker picker2 = new Picker(0,false,warehouse2);
        businessProcess(picker2);
        businessProcess(courier2);
        System.out.println(picker2);
        System.out.println(courier2);
        System.out.println(warehouse2);

        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println(warehouse1);

    }
    public static void businessProcess(Worker worker){
        for(int i = 0; i < 10000; i++){
            worker.doWork();
        }
    }
}

