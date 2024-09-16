public class main {
    public static void main(String[] args) {
        /// chiều rộng
        int width = Integer.parseInt(args[0]);
        System.out.println("Chieu rong: " + width);

        /// chiều dài
        int height = Integer.parseInt(args[1]);
        System.out.println("Chieu dai: " + height);


        /// tính chu vi
        int perimeter = 2 * (width + height);
        System.out.println("Chu vi hinh chu nhat: " + perimeter);

        /// tính diện tích
        int area = width * height;
        System.out.println("dien tich hinh chu nhat: " + area);

    }
}