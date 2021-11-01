package lesson05;

import java.util.List;
import java.util.Random;

public class CollectionsFunctions {

    private void printList(List<String> list) {
        for (String word : list) {
            System.out.print(word + " ");
        }
        System.out.println();

    }

    private void printNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    //Q1
    public void containsWordByIndex(List<String> list, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (list.size() > index) {
            System.out.println("Element is: " + list.get(index));
            printList(list);
        } else {
            System.out.println("Element doesn't exist at the given index");
        }
    }

    //Q2
    public void updateElement(List<String> list, int index, String word) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (list.size() > index) {
            list.set(index, word);
            printList(list);

        } else {
            System.out.println("Element doesn't exist at the given index");
        }
    }

    //Q3
    public void switchTwoElements(List<String> list, String firstWord, String secondWord) {
        if (list.contains(firstWord) && list.contains(secondWord)) {
            String temp = firstWord;
            int indexOfFirstWord = list.indexOf(firstWord);
            int indexOfSecondWord = list.indexOf(secondWord);
            list.set(indexOfFirstWord, secondWord);
            list.set(indexOfSecondWord, temp);
            printList(list);
        } else {
            System.out.println("One or two of the provided words don't exist in the list...");
        }
    }

    //Q4
    public void insertElement(List<String> list, String word, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index > list.size()) {
            System.out.println("Index is to large...will add element to the end of the list");
            index = list.size();
        }
        list.add(index, word);
        printList(list);
    }

    //Q5
    public void containsWord(List<String> list, String word) {
        if (list.contains(word)) {
            System.out.println("Element is At " + list.indexOf(word));
            printList(list);
        } else {
            System.out.println("The list doesn't contain this element...");
        }
    }

    //Q6
    public void sortBiggerToSmaller(List<Integer> numbers) {
        if (numbers.size() == 0) {
            System.out.println("List is empty...");
            return;
        }
        System.out.println("Original List: ");
        printNumbers(numbers);
        //Using Bubble Sort to move the bigger element to the start of the list.
        for (int i = 0; i < numbers.size() - 1; i++)
            for (int j = 0; j < numbers.size() - i - 1; j++)
                //If a given number is smaller than the element that comes after it:
                if (numbers.get(j) < numbers.get(j + 1)) {
                    //move the smaller number to the end of the list.
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
        System.out.println("Sorted List: ");
        printNumbers(numbers);
    }

    //Q7
    public void listShuffle(List<String> list) {
        Random rand = new Random();
        if (list.size() == 0) {
            System.out.println("List is empty...");
            return;
        }
        System.out.println("Original List: ");
        printList(list);
        for (int i = 0; i < list.size(); i++) {
            //Getting a random index
            int randomIndex = rand.nextInt(list.size());
            //Swapping the element at the current index with the element at i index.
            String temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }
        System.out.println("Shuffled List: ");
        printList(list);
    }

}