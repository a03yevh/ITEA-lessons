package Homeworks.HW_Lesson4;
import java.util.Scanner;

/*Використовуючи IntelliJ IDEA, створіть клас ReversedArray. Створити метод myReverse(int [] array), який приймає як аргумент масив цілочислових елементів і повертає
інвертований масив (елементи масиву у зворотному порядку). Створити метод int [] subArray (int [] array, int index, int count). Метод повертає частину
отриманого як аргумент масиву, починаючи з позиції, яка зазначена в аргументі index, розмірністю, що відповідає значенню аргументу count. Якщо аргумент
count містить значення більше, ніж кількість елементів, що входять до частини вихідного масиву (від зазначеного індексу index до індексу останнього елемента),
то під час формування нового масиву розмірністю в count, заповніть одиницями ті елементи, які не були скопійовані з вихідного масиву.*/

public class HW1_ReversedArray {
    public static void myReverse(int [] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] sub = new int[count];
        for (int i = 0; i < count; i++) {
            if (i + index < array.length) {
                sub[i] = array[i + index];
            } else {
                sub[i] = 1;
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int N = scanner.nextInt();

        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter array [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        //Task 1
        System.out.println("myReverse result: ");
        myReverse(array);

        //Task 2
        System.out.print("\nsubArray result: ");
        int[] sub1 = subArray(array, 4, 6);
        for (int i = 0; i < N; i++) {
            System.out.print(sub1[i] + " ");
        }
    }
}
