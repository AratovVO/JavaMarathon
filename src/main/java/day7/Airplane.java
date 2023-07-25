package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weigth){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weigth;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.length < airplane2.length){
            System.out.println("Самолет "+ airplane2.manufacturer + " длиннее");
        } else if(airplane1.length > airplane2.length){
            System.out.println("Самолет "+ airplane1.manufacturer + " длиннее");
        } else{
            System.out.println("Длины самолетов равны");
        }
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
    public void info(){
        System.out.println("Изготовитель: " + manufacturer
                + ", год выпуска: " + year
                + ", длина: " + length
                + ", вес: " + weight
                + ", количество топлива в баке: " + getFuel());
    }
    public int fillUp(int extraFuel){
         return fuel = getFuel() + extraFuel;
    }

}
