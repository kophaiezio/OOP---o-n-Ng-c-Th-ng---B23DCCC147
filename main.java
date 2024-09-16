public class main {
    public static void main(String[] args) {
        // Tạo một hình chữ nhật
        shape rectangle = new Rectangle(5, 3);
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());

        // Tạo một hình tròn
        shape circle = new Circle(4);
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
        System.out.println("Diện tích hình tròn: " + circle.getArea());
    }
}