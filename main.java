public class main {
    private int width;
    private int height;

    public main(int width, int height) {
        if (common.isPositiveInteger(height) && common.isPositiveInteger(width)){
            this.width = width;
            this.height = height;
            } else {
                throw new IllegalArgumentException("Chieu rong va chieu dai phai la so nguyen duong");
            }
    }

    /// getter cho chiều rộng
    public int getWidth() {
        return width;
    }
    /// setter cho chiều rộng
    public void setWidth(int width) {
        if (common.isPositiveInteger(width)){
            this.width = width;
        } else {
            throw new IllegalArgumentException("Chieu rong phai la so nguyen duong");
        }
    }
    /// getter cho chiều dài
    public int getHeight() {
        return height;
    }
    /// setter cho chiều dài
    public void setHeight(int height) {
        if (common.isPositiveInteger(width)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Chieu rong phai la so nguyen duong!");
        }
    }

    /// tính diện tích
    public int getArea() {
        return width * height;
    }

    /// tính chu vi
    public int getPerimeter() {
        return 2 * (width + height);
    }

    /// tạo hiện thị
    public void display() {
        System.out.println("chieu rong: " + height);
        System.out.println("chieu dai: " + width);
        System.out.println("Dien tich: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }

    /// taọ đối tượng
    public static void main(String[] args) {
        main myRectangle = new main(5, 10);
        myRectangle.display();


        try {
            /// sử dụng setter thay đổi
            myRectangle.setHeight(20);
            myRectangle.setWidth(30);


            /// sau khi thay đổi hiện thị
            System.out.println("Sau khi thay doi: ");
            myRectangle.display();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
    
        }
    }

    
}