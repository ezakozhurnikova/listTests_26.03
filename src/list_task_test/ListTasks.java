package list_task_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTasks {
    public List<String>removeNamesLength4(List<String>names){
        List<String>res=new ArrayList<>();
        for (String name:names){
            if (name.length()!=4) res.add(name);

        }return res;
    }
/*Есть два списка одинаковой длинны с целыми числами. Написать метод,
который возвращает список с элементами Yes или No, где значение на I-том
месте зависит от того , равны ли элементы двух списков под номер i*/


    public List<String> compareYesNo(List <Integer> ints1, List<Integer>ints2) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < ints1.size(); i++) {
            if (ints1.get(i) == ints2.get(i))
                result.add("Yes");
            else
                result.add("No");


        }return result;
    }
    //возвращает список элементов в обратном порядке

    public List<Integer>reversed(List<Integer>ints){
        Collections.reverse(ints);
        return ints;
    }
}
