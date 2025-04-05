package lesson3;

import java.util.HashSet;
import java.util.Objects;

public class Animal {
    String Type;
    int age;

    public Animal(String type, int age) {
        Type = type;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(Type, animal.Type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Type, age);
    }

    public static void main(String[] args) {
        HashSet<Animal> animals = new HashSet<>();

        Animal animal1 = new Animal("Dog", 22);
        Animal animal2 = new Animal("Cat", 3);
        Animal animal3 = new Animal("Dog", 22);

        System.out.println(animal1.equals(animal3));
        System.out.println(animal1.hashCode());


    }
}
