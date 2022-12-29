import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    ArrayList<Record> recordsList = new ArrayList<>();


    PhoneBook(Record r){
        recordsList.add(r);
    }

    //Getter
    public List<Record> getAllRecords(){
        return recordsList;
    }


    public long getMaxid(){
        long j = 0;
        //Находит максимальное значение
        for(int i=0;i<recordsList.size();i++){
            if(recordsList.get(i).id>j){
                j=recordsList.get(i).id;
            }
        }

        return j;
    }


    public void createRecord(Record record) throws MyExceptionClass{
        for(int i = 0; i<recordsList.size(); i++){
            //Выдает ошибку, при совпадении номеров в списке
            if(Objects.equals(recordsList.get(i).phoneNumber, record.phoneNumber)){
                throw new MyExceptionClass("Такой номер уже существует");
            }
            //Прогоняет дальше
            if(Objects.equals(recordsList.get(i).id, record.id)){
                record.id = getMaxid()+1;

            }
        }
        recordsList.add(record);
    }

    public void updateRecord(Record record){
        for(int i = 0; i<recordsList.size(); i++){
            //Проверяет наличие и заполняет
            if(recordsList.get(i).id == record.id){
                recordsList.get(i).phoneNumber = record.phoneNumber;
                recordsList.get(i).Name = record.Name;
                return;
            }
        }
        throw new MyExceptionRunTime("Record Not Found");

    }

    /*
    Deletes record by it`s id
     */
    public void deleteRecord(long id){
        //Проверяет список на совпадение id
        for(int i = 0; i<recordsList.size();i++){
            if(recordsList.get(i).id ==  id){
                recordsList.remove(i);
                return;
            }
        }
        throw new MyExceptionRunTime("Record Not found");
    }
}