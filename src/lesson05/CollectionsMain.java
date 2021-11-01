package lesson05;

import java.util.ArrayList;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {
        CollectionsFunctions functions = new CollectionsFunctions();
        List<String> words = new ArrayList<>();
        words.add("Saed");
        words.add("Jaber");
        words.add("QA");
        words.add("Elevation");
        words.add("Automation");
        //Q1
        System.out.println("=====Does List Contain index?=========");
        functions.containsWordByIndex(words, 4);
        //Q2
        System.out.println("=====Update Element By Index=========");
        functions.updateElement(words, 3, "Meta");
        //Q3
        System.out.println("=====Switch Two Elements=========");
        functions.switchTwoElements(words, "Jaber", "Automation");
        //Q4
        System.out.println("=====Insert Element At A Given Index=========");
        functions.insertElement(words, "Course", 0);
        //Q5
        System.out.println("=====Does List Contain Element?=========");
        functions.containsWord(words, "Madara");
        //Q6
        System.out.println("=====Sort List=========");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(6);
        functions.sortBiggerToSmaller(numbers);
        //Q7
        System.out.println("===== Shuffle List=========");
        functions.listShuffle(words);
    }
}
