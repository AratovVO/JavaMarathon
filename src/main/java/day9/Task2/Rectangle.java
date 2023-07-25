package day9.Task2;

public class Rectangle extends Figure {
    private int heigh;
    private int width;

    public Rectangle(int heigh, int width, String color) {
        super(color);
        this.heigh = heigh;
        this.width = width;
    }
    public double area(){
        return heigh*width;
    }

    @Override
    public double perimeter() {
        return 2*(heigh+width);
    }
}
