import java.sql.SQLOutput;
import java.util.ArrayList;

public class Uni {
    public static void main(String[] args) {

        System.out.println("Выводим информацию о студенте\n----------------------");
        Student student1 = new Student(1,"Николай", "Скворцов", 5, 4.8);
        Student student2 = new Student(2,"Артем", "Николаев", 7, 3.9);
        Student student3 = new Student(3,"Василий", "Александров", 18, 5.0);
        Student student4 = new Student(4,"Эдвард", "Бикметов", 2, 4.9);

        Group1 group1 = new Group1("1");
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        //Выводим первого студента
        student1.printInfo();
        //Выводим студента по номеру зачетки
        System.out.println("Номер студента: " + group1.getByNumber(2).number);
        group1.deleteStudent((student2));
        System.out.println("_______________");
        //Выводим возраст и количество студентов
        System.out.println("Мапа");
        System.out.println(group1.getCountByAge());
        //Выводим студентов со средним баллом 4.0 и выше
        System.out.println("Список студентов со средним баллом выше 4.0");
        System.out.println(group1.getByMinScore(4.0));
        System.out.println("Вывести всех стдентов");
        System.out.println(group1.getAll());
        /*ArrayList<Student> groupList = group1.getAll();
        for (int i=0; i<groupList.size(); i++) {
            System.out.println(groupList.get(i).number);
        }
         */

        //student1.printInfo();

    }
}







