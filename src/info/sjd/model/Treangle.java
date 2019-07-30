package info.sjd.model;

public class Treangle {

    public double base;

    public double heigth;


    public double getArea(){
        double area = (base * heigth)/2;
        return area;
    }
    public Treangle(double base, double heigth) {
        this.base = base;
        this.heigth = heigth;
    }
    public Treangle(double base, double heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    public Treangle() {
    }
}