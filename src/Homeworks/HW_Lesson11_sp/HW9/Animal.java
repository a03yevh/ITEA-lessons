package Homeworks.HW_Lesson11_sp.HW9;

import java.lang.reflect.Field;

/*Створіть 2 класи, Animal та Cat.
        У класі Animal ініціалізуйте 3 поля різних модифікаторів.
        У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.

        Додайте модифікатори:
        Final
        Static*/

class Animal {
    private final String name;
    protected static int age;
    public String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        Animal.age = age;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public String getSound() {
        return sound;
    }
}

class Cat {
    public static void main(String[] args) throws IllegalAccessException {
        Animal animal = new Animal("Lion", 5, "Roar");

        Class<?> animalClass = animal.getClass();

        try {
            Field nameField = animalClass.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(animal, "Tiger");

            Field ageField = animalClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.setInt(animal, 3);

            Field soundField = animalClass.getDeclaredField("sound");
            soundField.setAccessible(true);
            soundField.set(animal, "Meow");

            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + Animal.getAge());
            System.out.println("Sound: " + animal.getSound());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
