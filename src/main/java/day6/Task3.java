package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Мария Ивановна", "Информатика");
        Student student1 = new Student("Василий");

        teacher.evaluate(student1);
    }
}
