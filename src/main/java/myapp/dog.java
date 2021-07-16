package myapp;

import java.util.ArrayList;
import java.util.List;

class Dog {
  public static List<Dog> all = new ArrayList<Dog>();

  private String name;
  private String breed;
  private int age;
  private boolean neutered;
  private Person owner;

  public Dog(String name, String breed, int age, boolean neutered, Person owner) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.neutered = neutered;
    this.owner = owner;

    all.add(this);
  }

  public String getName() {
    return this.name;
  }

  public Person getOwner() {
    return this.owner;
  }
}