// Lớp cha Shape
abstract class Shape {
    // Phương thức trừu tượng để tính chu vi
    abstract double getPerimeter();
    
    // Phương thức trừu tượng để tính diện tích
    abstract double getArea();
}

// Lớp con Rectangle (Hình chữ nhật)
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    double getArea() {
        return width * height;
    }
}

// Lớp con Circle (Hình tròn)
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
