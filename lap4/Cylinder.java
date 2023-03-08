package lap4;

public class Cylinder extends Circle {
    public double height;

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return radius*radius*height*Math.PI;
    }
    public double getArea(){
        return 2*radius*height*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
