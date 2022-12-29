/*
public class Maincl {
    public static void main(String[] args) {
        try{
        System.out.println("Выводим информацию о студенте\n----------------------");
        Record record1 = new Record(1,"89131234532", "Скворцов");
        //Record record2 = new Record(2,"89238927363", "Бикметов");
        //Record record3 = new Record(3,"89139380020", "Латыш");
        //pb - group2, r - record1
        PhoneBook group2 = new PhoneBook(record1);
        group2.createRecord(record1);
        group2.createRecord(record2);
        group2.createRecord(record3);
        System.out.println(group2.getAll());
        group2.deleteRecord(3);
        System.out.println(group2.getAll());
        for(Record record: group2.recordsList){
            System.out.println(record.recordInfo());
        }
        } catch (MyExceptionClass e) {
        System.out.println(e);
    }

}}

 */


public class Maincl {

    /*
    Just shows work of classes without throwing any exceptions
     */
    public static void main(String[] args) throws MyExceptionClass {
        try {
            Record r = new Record(1, "1", "A");
            PhoneBook pb = new PhoneBook(r);
            pb.createRecord(new Record(2, "2", "Эдуард"));
            pb.createRecord(new Record(3, "3", "Никита"));
            pb.deleteRecord(3);
            pb.updateRecord(new Record(1, "4", "Александр"));
            for(Record record: pb.recordsList){
                System.out.println(record.recordInfo());
            }
        } catch (MyExceptionClass e) {
            System.out.println(e);
        }



    }

}
