package Homeworks.HW_Lesson6;
import java.util.Random;

public class HW6_Printer {
    void print(String value) {
        System.out.println(value);
    }
}

class ColoredPrinter extends HW6_Printer {
    private Random random;

    ColoredPrinter() {
        random = new Random();
    }

    @Override
    void print(String value) {
        int colorCode = random.nextInt(6) + 31;  // ANSI color
        String coloredValue = "\u001B[" + colorCode + "m" + value + "\u001B[0m";
        super.print(coloredValue);
    }
}
