package Java_OOP.Lab.Polymorphism.Shapes;

public class Circle extends  Shape {
    private double radios;

    public Circle(double radios) {
        this.radios = radios;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radios;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radios,2) * Math.PI;
    }
}
