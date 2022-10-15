public class Student {
    int number;
    String name;
    String lastName;
    int age;
    double averageScore;



    public Student(int number,String name,String lastName,int age,double averageScore){
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public void printInfo(){

        System.out.println("----------------------");
        System.out.println("Информация о студенте:\nНомер зачетной книжки: " + number + "\nИмя: " + name +
                "\nФамилия: " + lastName + "\nВозраст: " + age +
                "\nСредний балл: " + averageScore);
        System.out.println("----------------------");
    }
    @Override
    public String toString(){
        return "Имя "+ name+" "+lastName+" Возраст "+age+" Средний балл "+averageScore;
    }
}