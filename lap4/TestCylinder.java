package lap4;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        cylinder.radius=5;
        cylinder.height=7;
        double S= cylinder.getArea();
        System.out.println("dien tich hinh tru la   "+S);
    }
}
