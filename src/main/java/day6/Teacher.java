package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int max = 5;
        int min = 2;
        int mark = random.nextInt(max - min + 1) + min;
        String strMark;
        if(mark == 2) {
            strMark = "Неуодвлетворительно";
        } else if (mark == 3){
            strMark = "Удовлетворительно";
        } else if(mark == 4){
            strMark = "Хорошо";
        } else {
            strMark = "Отлично";
        }
        System.out.println("Преподаватель " + name
                + " оценил студента с именем " + student.getName()
                + " по предмету " + lesson
                + " на оценку " + strMark);
    }
}
