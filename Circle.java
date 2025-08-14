


public class Circle {
    private double x;
    private double y;
    protected double radius;

    // Constructor không tham số
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    // Constructor có tham số
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Setter bán kính
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter bán kính
    public double getRadius() {
        return this.radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Trả về thông tin hình tròn dạng "(x, y, radius)"
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + radius + ")";
    }

    // Hàm main để test
    public static void main(String[] args) {
        Circle c = new Circle(2.0, 3.0, 5.0);
        
        System.out.println("Thông tin hình tròn: " + c.toString());
        System.out.println("Diện tích hình tròn: " + c.getArea());
    }
}
