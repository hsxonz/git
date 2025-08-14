public class Triangle {
    private double x;
    private double y;
    protected double base;
    protected double height;

    // Constructor mặc định
    public Triangle() {
        this.x = 0;
        this.y = 0;
        this.base = 0;
        this.height = 0;
    }

    // Constructor có tham số
    public Triangle(double x, double y, double base, double height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    // Setter kích thước
    public void setSize(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Getter đáy
    public double getBase() {
        return this.base;
    }

    // Getter chiều cao
    public double getHeight() {
        return this.height;
    }

    // Tính diện tích
    public double getArea() {
        return 0.5 * base * height;
    }

    // Hiển thị thông tin
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + base + ", " + height + ")";
    }

    // Test
    public static void main(String[] args) {
        Triangle t = new Triangle(0.0, 0.0, 6.0, 4.0);
        System.out.println("Thông tin tam giác: " + t.toString());
        System.out.println("Diện tích tam giác: " + t.getArea());
    }
}

