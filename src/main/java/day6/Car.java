package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfIssue;
    public Car(String model, String color, int yearOfIssue) {
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

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
    public String toString() {
        return "Car model: " + getModel() + "\nCar color: " + getColor() + "\nYear of car manufacture: " + getYearOfIssue();
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int  inputYear){
        if(inputYear > yearOfIssue){
            return inputYear - yearOfIssue;
        } else if(inputYear < yearOfIssue) {
            return yearOfIssue - inputYear;
        } else {
            return 0;
        }
    }
}
