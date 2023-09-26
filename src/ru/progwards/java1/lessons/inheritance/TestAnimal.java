package ru.progwards.java1.lessons.inheritance;

public class TestAnimal {
    public static void printAnimal(Animal animal) {
        System.out.println(animal.toString() + " - " + animal.say());
    }
    public static void main(String[] args) {
        Cow cowOne = new Cow("Пеструшка");
        Cow cowTwo = new Cow("Рыжая");
        Duck duckOne = new Duck("Даша");
        Duck duckTwo = new Duck("Маша");
        Hamster hamsterOne = new Hamster("Акакий");
        Hamster hamsterTwo = new Hamster("Поликарп");
        printAnimal(cowOne);
        printAnimal(cowTwo);
        printAnimal(duckOne);
        printAnimal(duckTwo);
        printAnimal(hamsterOne);
        printAnimal(hamsterTwo);
    }
}
