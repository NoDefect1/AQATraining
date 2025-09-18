package org.example.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        pb.add("Васильев", "+375 29 111-11-11");
        pb.add("Лепешинский", "+375 33 222-22-22");
        pb.add("Васильев", "+375 44 333-33-33");

        System.out.println("Васильев: " + pb.get("Васильев"));
        System.out.println("Лепешинский: " + pb.get("Лепешинский"));

    }
}

