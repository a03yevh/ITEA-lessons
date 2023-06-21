package Homeworks.HW_Lesson9_sp.HW1;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть перерахунковий тип (enum) Animals, що містить конструктор, який повинен набувати
цілого числа (вік тварини), і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.*/
public class Main {
    public static void main(String[] args) {
        Animals dog = Animals.DOG;
        dog.setAge(3);
        System.out.println(dog);

        Animals cat = Animals.CAT;
        cat.setAge(5);
        System.out.println(cat);

        Animals bird = Animals.BIRD;
        bird.setAge(2);
        System.out.println(bird);
    }
}