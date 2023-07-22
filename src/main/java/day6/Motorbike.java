package day6;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfIssue;

    public Motorbike(String model, String color, int yearOfIssue) {
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
    public void info(){
        System.out.println("Это мотоцикл");
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

    public String toString() {
        return "Motorbike model: " + getModel() + "\nMotorbike color: " + getColor() + "\nYear of motorbike manufacture: " + getYearOfIssue();
    }
}
