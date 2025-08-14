// đặt tên file là Product.java

import java.util.Locale;

public class Cau2 {
    private String name;
    private String id;
    protected double price;

    // Constructor mặc định
    public Cau2() {
        this.name = "";
        this.id = "";
        this.price = 0.0;
    }

    // Constructor đầy đủ
    public Cau2(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    // Thuế VAT 10% giá bán
    public double getTax() {
        return price * 0.10;
    }

    @Override
    public String toString() {
        // price hiển thị 2 số sau dấu chấm
        return String.format(Locale.US, "(%s, %s, %.2f)", name, id, price);
    }

    // Demo theo yêu cầu đề
    public static void main(String[] args) {
        Cau2 p = new Cau2("Laptop", "P001", 1234.5);
        System.out.printf(Locale.US, "Thuế VAT: %.2f%n", p.getTax());
        System.out.println("toString(): " + p.toString());
    }
}
