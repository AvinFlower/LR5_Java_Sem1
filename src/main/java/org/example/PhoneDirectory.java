package org.example;

import java.util.*;

public class PhoneDirectory {

    private Map<String, TreeSet<String>> directory;

    public PhoneDirectory() {
        directory = new LinkedHashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        // Получаем множество телефонных номеров для данной фамилии
        TreeSet<String> phoneNumbers = directory.getOrDefault(lastName, new TreeSet<>());

        // Добавляем новый номер в множество
        phoneNumbers.add(phoneNumber);

        // Помещаем обновленное множество обратно в справочник
        directory.put(lastName, phoneNumbers);
    }

    public List<String> get(String lastName) {
        // Получаем множество телефонных номеров для данной фамилии
        TreeSet<String> phoneNumbers = directory.get(lastName);

        // Возвращаем список номеров
        return (phoneNumbers != null) ? new ArrayList<>(phoneNumbers) : new ArrayList<>();
    }

    //Весь справочник
    public void printDirectory() {
        // Выводим справочник в порядке добавления фамилий
        for (Map.Entry<String, TreeSet<String>> lastName : directory.entrySet()) {
            System.out.println(lastName);
        }
    }
}