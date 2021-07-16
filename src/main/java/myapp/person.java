package myapp;

import java.util.ArrayList;
import java.util.List;

class Person {
    public static List<Person> all = new ArrayList<Person>();

    private String name;
    private int age;

    public static void main(String[] args) {
        Person stacey = new Person("Stacey", 5);
        Person joe = new Person("Joe", 3);

        Dog fluffy = new Dog("Fluffy", "brown", 27, true, stacey);
        Dog sunny = new Dog("Sunny", "yellow", 12, false, stacey);
        Dog bixby = new Dog("Bixby", "blue", 33, true, joe);

        for (Person person : all) {
            System.out.println(person.name + " is " + person.age + " years old.");
            System.out.println(person.name + " has the dogs:");

            Dog[] personsDogs = person.dogs();
            for (int i = 0; i < personsDogs.length; i++) {
                System.out.println("  " + (i + 1) + ". " + personsDogs[i].getName());
            }
        }
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        all.add(this);
    }

    private Dog[] dogs() {
        List<Dog> personsDogs = new ArrayList<Dog>();
        for (Dog dog : Dog.all) {
            if (dog.getOwner() == this) personsDogs.add(dog);
        }

        Dog[] dogArray = new Dog[personsDogs.size()];
        personsDogs.toArray(dogArray);
        return dogArray;
    }
}