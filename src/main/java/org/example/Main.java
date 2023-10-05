package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"яблоко", "банан", "апельсин", "яблоко", "банан", "апельсин", "виноград", "киви"};

        HashMap<String, Integer> listWord = new HashMap<>();
        for (String s : words) {
            listWord.merge(s, 1, Integer::sum);
        }
        System.out.println(listWord.entrySet());



        System.out.println("\nТелефонный справочник:");
        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Прилуков", "555-555-555");
        directory.add("Прилуков", "123-456-789");
        directory.add("Субботин", "987-654-321");
        directory.add("Арилуков", "555-555-555");
        directory.add("Субботин", "111-654-321");
        directory.add("Прилуков", "666-666-666");
        directory.add("Ирилуков", "966-696-999");

        System.out.println("Весь справочник: ");
        directory.printDirectory();
    }
}