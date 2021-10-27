package lesson03;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionsSet {
    public static void listPrint(Set<String> set) {
        for (String country : set) {
            System.out.print(country + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        //Create a list
        Set<String> countries= new HashSet<>();
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
        countries.remove( "UK");
        listPrint(countries);
        //Check for Germany:
        if (countries.contains("Germany")) {
            System.out.println("Germany  exists");
        } else {
            System.out.println("NO");
        }
        //Create a new list and push the old list:
        Set<String> countriesExpand= new HashSet<>();
        countriesExpand.add("PlanetX");
        countriesExpand.add("PlanetY");
        countriesExpand.addAll(countries);
        listPrint(countriesExpand);

    }
}
