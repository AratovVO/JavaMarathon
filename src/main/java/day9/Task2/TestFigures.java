package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));


    }
    public static double calculateRedPerimeter(Figure[] figures){
        double result = 0;
        for(int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())){
                result += figures[i].perimeter();
            }
        }
        return result;
    }
    public static double calculateRedArea(Figure[] figures){
        double result = 0;
        for(int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())){
                result += figures[i].area();
            }
        }
        return result;
    }
}
