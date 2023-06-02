package Homeworks.HW_Lesson7.HW1;

public class ArtDecoTable implements Table {
    private String name;
    private double price;

    public ArtDecoTable(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
