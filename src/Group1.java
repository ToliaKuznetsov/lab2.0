import java.util.ArrayList;
import java.util.HashMap;

public class Group1{
    private ArrayList<Student> group = new ArrayList<>();
    private String groupNumber;
    public Group1(String num){this.groupNumber = num;}
    //Скорее всего нужно чисто из номеров
    public void addStudent(Student newStudent) {
        this.group.add(newStudent);
    }

    public Student getByNumber(int serialNumber){
        for(Student student: this.group){
            if (student.number == serialNumber){
                student.printInfo();
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(Student student){
        this.group.remove(student);
    }

    public ArrayList<Student> getAll() { return new ArrayList<>(group);}

    public HashMap<Integer, Integer> getCountByAge(){
        HashMap<Integer, Integer> studentMap = new HashMap<>();
        for(Student student : group){
            if(!studentMap.containsKey(student.age)){
                int numOfStudents = 0;
                for(Student stud:group){
                    if(stud.age==student.age){
                        numOfStudents += 1;
                    }
                }
                studentMap.put(student.age, numOfStudents);
            }
        }
        return studentMap;
    }
    public ArrayList<Student> getByMinScore(double score){
        ArrayList<Student> studentList = new ArrayList<>();
        for(Student student:group){
            if(student.averageScore >= score) {
                studentList.add(student);
            }
        }
        return studentList;
    }



    public void printInfo(){
        System.out.println("Номер группы" + group);
    }
    //public Student getByNumber(int serialNumber){this.number = serialNumber;}
}