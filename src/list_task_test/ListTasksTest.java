package list_task_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTasksTest {
    private ListTasks listtasks;

    @BeforeEach
    public void init() {
        listtasks = new ListTasks();

    }

    @Test
    public void removeNamesLength4_forIn_twoOut() {
        List<String> actual = Arrays.asList("John", "Pablo", "Ann", "Jack");
        List<String> expected = Arrays.asList("Pablo", "Ann");
        assertEquals(expected, listtasks.removeNamesLength4(actual));

    }

    @Test
    public void removeNames_test_empty() {
        assertEquals(Arrays.asList(), listtasks.removeNamesLength4(Arrays.asList()));
    }

    @Test
    public void removeNames_test_allNamesLength4() {
        List<String> actual = Arrays.asList("Johnn", "Pablo", "Ann", "Jackk");
        List<String> expected = Arrays.asList("Johnn", "Pablo", "Ann", "Jackk");
        assertEquals(expected, listtasks.removeNamesLength4(actual));

    }

    @Test
    public void when_allNamesLength4_then_returnEmptyList() {
        List<String> actual = Arrays.asList("John", "Pabl", "Annn", "Jack");
        List<String> expected = Arrays.asList();

        assertEquals(expected, listtasks.removeNamesLength4(actual));
    }

    // task2
    @Test
    public void Yes_No_Test() {
        List<Integer> actual1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual2 = Arrays.asList(2, 3, 6, 7);
        List<String> expected = Arrays.asList("Yes", "No", "Yes", "No");
        assertEquals(expected, listtasks.compareYesNo(actual1, actual2));
    }

    @Test
    public void allYesTest() {
        List<Integer> actual1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual2 = Arrays.asList(2, 4, 6, 8);
        List<String> expected = Arrays.asList("Yes", "Yes", "Yes", "Yes");
        assertEquals(expected, listtasks.compareYesNo(actual1, actual2));
    }

    @Test
    public void allNoTest() {
        List<Integer> actual1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual2 = Arrays.asList(1, 3, 5, 7);
        List<String> expected = Arrays.asList("No", "No", "No", "No");
        assertEquals(expected, listtasks.compareYesNo(actual1, actual2));
    }

    @Test
    public void compareYesNo_test_empty() {
        assertEquals(Arrays.asList(), listtasks.compareYesNo(Arrays.asList(), Arrays.asList()));
    }

    //task 3
    @Test
    public void reverse_Test(){
        List<Integer> actual = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected = Arrays.asList(8, 6, 4, 2);
        assertEquals(expected, listtasks.reversed(actual));
    }
    @Test
    public void reverse_test_empty() {
        assertEquals(Arrays.asList(), listtasks.reversed(Arrays.asList()));
    }
}