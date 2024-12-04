package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "pear", "banana", "pineapple", "mango");

        System.out.println("Schleife");
        for (String fruit : fruits) {
            if (fruit.contains("n")){
                if (fruit.length() >=6){
                    System.out.println(fruit);
                }
            }
        }
        System.out.println("Stream");
            //Start = .stream()
        List<String> filteredFruits = fruits.stream()
           //beliebige Anzahl manipulierender Operationen
                //Übergabeparameter -> Returnwert
                .filter(currywurst -> currywurst.contains("n"))
                .filter(currywurst -> currywurst.length()>=6)
          //Terminator => beendet Stream.
                .collect(Collectors.toList());

        System.out.println(filteredFruits);
    }
}
class ContainsN implements Predicate<String> {
    @Override
    public boolean test(String currywurst) {
        return currywurst.contains("n");
    }
}
