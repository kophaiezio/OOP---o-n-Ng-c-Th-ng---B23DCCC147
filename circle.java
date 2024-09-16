public class circle {
    private int radius;

    public circle(int radius) {
        if (common.isPositiveInteger(radius)) {
            this.radius = radius;
            } else {
                throw new IllegalArgumentException("Ban kinh phai la so nguyen duong");
            }
    }


    /// getter cho chiều rộng
    public int getRadius() {
        return radius;
    }
    /// setter cho chiều rộng
    public void setRadius(int width) {
        if (common.isPositiveInteger(width)){
            this.radius = width;
        } else {
            throw new IllegalArgumentException("Ban kinh phai la so nguyen duong");
        }
    }

    /// tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /// tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /// hiện thị
    public void displayCircle() {
        System.out.println("Radius: " + radius);
        System.out.println("Dien tich: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }

    /// taọ đối tượng
    public static void main(String[] args) {
        circle myCircle = new circle(5);
        myCircle.displayCircle();


        try {
            /// sử dụng setter thay đổi
            myCircle.setRadius(20);


            /// sau khi thay đổi hiện thị
            System.out.println("Sau khi thay doi: ");
            myCircle.displayCircle();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
    
        }
    }



}