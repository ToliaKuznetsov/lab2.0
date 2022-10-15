public class Maincl {
    public static void main(String[] args) {

        System.out.println("Выводим информацию о студенте\n----------------------");
        Record record1 = new Record(1,"89131234532", "Скворцов");
        Record record2 = new Record(2,"89238927363", "Бикметов");
        Record record3 = new Record(3,"89139380020", "Латыш");

        PhoneBook group2 = new PhoneBook("1");
        group2.createRecord(record1);
        group2.createRecord(record2);
        group2.createRecord(record3);
        System.out.println(group2.getAll());
        group2.deleteRecord(3);
        System.out.println(group2.getAll());
}}
