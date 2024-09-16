abstract class shape {
    // Phương thức tính chu vi (perimeter)
    abstract double getPerimeter();
    
    // Phương thức tính diện tích (area)
    abstract double getArea();
}

// Lớp con Rectangle (Hình chữ nhật)
class Rectangle extends shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Tính chu vi hình chữ nhật
    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }

    // Tính diện tích hình chữ nhật
    @Override
    double getArea() {
        return width * height;
    }
}

// Lớp con Circle (Hình tròn)
class Circle extends shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Tính chu vi hình tròn
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Tính diện tích hình tròn
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}



