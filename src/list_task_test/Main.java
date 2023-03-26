package list_task_test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons=new ArrayList<>();

        persons.add(new Person("Holy",12,"Friedrichstr"));
        persons.add(new Person("Jack",14,"Potsdamerstr"));
        Address address1=new Address(12,"Friedrichstr");
        Address address2=new Address(14,"Potsdamerstr");
        System.out.println(Person.getAddresses(persons));



    }
}
