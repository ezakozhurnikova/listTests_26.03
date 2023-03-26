package list_task_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*Задача*
Есть два класса: Address с полями String street и int houseNumber и Person с полями
String name и Address address. Нужно написать метод List<< Address > getAddresses(List persons)
 то есть по списку persons метод будет возвращать список их адресов. Протестировать его.*/

public class Person extends Address {
    String name;
  Address address;
    List<Person> persons=new ArrayList<>();
    List<Address>addresses=new ArrayList<>();


    public Person(String name,int houseNumber,String street) {
        super(houseNumber, street);
        this.name=name;
    }



    public static HashMap<String, Integer>getAddresses(List<Person> persons){
        HashMap<String, Integer> addressMap = new HashMap<>();

        for (Person person : persons) {
            addressMap.put(Address.getStreet(), Address.getHouseNumber());

        }


        return addressMap;
    }
}
