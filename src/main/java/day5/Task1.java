package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Black");
        car1.setModel("Tesla");
        car1.setYearOfIssue(2023);
        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getYearOfIssue());
    }
}
class Car{
    private String model;
    private String color;
    private int yearOfIssue;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
