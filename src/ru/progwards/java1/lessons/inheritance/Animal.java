package ru.progwards.java1.lessons.inheritance;

public abstract class Animal {
    String name, kind, say;
      public Animal(String name) {
        this.name = name;
    }
    public abstract String kind();  // {
//        this.kind = kind;
//    }
    public abstract String say();   // {
//        this.say = say;
//   }
   @Override
   public String toString() {
          return "Это " + kind() + " " + name;
      }
}
