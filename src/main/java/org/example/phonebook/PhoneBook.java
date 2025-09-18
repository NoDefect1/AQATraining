package org.example.phonebook;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        String pattern = "^\\+375\\s(25|29|33|44)\\s\\d{3}-\\d{2}-\\d{2}$";//Проверка формата номера
        if (!phoneNumber.matches(pattern)) {
            throw new IllegalArgumentException("Неверный формат номера: " + phoneNumber);
        }
        phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, Collections.emptyList());
    }
}

