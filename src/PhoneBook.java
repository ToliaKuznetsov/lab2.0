import java.util.ArrayList;

public class PhoneBook {
    private String groupNumber;
    public PhoneBook(String num){this.groupNumber = num;}
    private ArrayList<Record> phonebook = new ArrayList<>();

    public ArrayList<Record> getAll() { return new ArrayList<>(phonebook);}
    public void createRecord(Record newRecord) {this.phonebook.add(newRecord);}
    public void deleteRecord(long id){
        this.phonebook.remove(id);
    }
    public void printInfo(){
        System.out.println("Номер телефона" + groupNumber);
    }
}
