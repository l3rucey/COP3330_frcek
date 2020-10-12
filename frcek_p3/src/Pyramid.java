// IN ALL CLASSES. change the fields to actually indicate the proper measurements
public class Pyramid extends Shape3D{
    String name = "pyramid";
    double length;
    double width;
    double height;

    public Pyramid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    // use math.pow in other classes
    public double getArea() {
        return (this.length*this.width)+this.length*Math.sqrt(Math.pow((this.width/2),2)+Math.pow(this.height, 2))+this.width*Math.sqrt(Math.pow((this.length/2), 2)+Math.pow(this.height, 2));
    }

    public double getVolume() {
        return ((this.length*this.width*this.height)/3);
    }
}