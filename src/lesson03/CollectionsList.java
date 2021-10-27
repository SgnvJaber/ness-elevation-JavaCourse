package lesson03;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList {
    public static void listPrint(List<String> list) {
        for (String country : list) {
            System.out.print(country + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        //Create a list
        List<String> countries = new ArrayList<>();
        //Fill List
        countries.add("Japan");
        countries.add("China");
        countries.add("Israel");
        countries.add("USA");
        countries.add("Austria");
        //countries.add("Germany");
        //Print List
        listPrint(countries);
        //Print List's Size
        System.out.println("Size: " + countries.size());
        //Modify List
        countries.set(2, "UK");
        listPrint(countries);
        //Check for Germany:
        if (countries.contains("Germany")) {
            System.out.println("Germany at index: " + countries.indexOf("Germany"));
        } else {
            System.out.println("NO");
        }
        //Print Country at last index
        System.out.println("Country at Last Index: " + countries.get(countries.size() - 1));
        //Create a new list and push the old list:
        List<String> countriesExpand = new ArrayList<>();
        countriesExpand.add("PlanetX");
        countriesExpand.add("PlanetY");
        countriesExpand.addAll(countries);
        listPrint(countriesExpand);

    }

}
