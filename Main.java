import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách chứa các hình
        ArrayList<Shape> shapes = new ArrayList<>();
        
        // Thêm hình chữ nhật và hình tròn vào danh sách
        shapes.add(new Rectangle(5, 3));
        shapes.add(new Circle(4));

        // Biến để lưu tổng diện tích và chu vi
        double totalPerimeter = 0;
        double totalArea = 0;

        // Tính tổng chu vi và diện tích
        for (Shape shape : shapes) {
            totalPerimeter += shape.getPerimeter();
            totalArea += shape.getArea();
        }

        // In kết quả
        System.out.println("Tổng chu vi của tất cả các hình: " + totalPerimeter);
        System.out.println("Tổng diện tích của tất cả các hình: " + totalArea);
    }
}
