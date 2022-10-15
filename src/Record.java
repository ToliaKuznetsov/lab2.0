public class Record {
    long id;
    String name;
    String phoneNumber;




    public Record(long id,String phoneNumber,String name){
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public void printInfo(){

        System.out.println("----------------------");
        System.out.println("Информация о студенте:\nНомер ");
        System.out.println("----------------------");
    }
    @Override
    public String toString(){
        return "ID "+ id+" Имя "+name;
    }
}