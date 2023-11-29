package es1;

public class Rettangolo {
    private final double height;
    private final double width;

    public Rettangolo(double height, double width){
        this.height = height;
        this.width = width;
    }


    public double perimeter(){
        return 2*(this.height+this.width);
    }
    public double area(){
        return this.height*this.width;
    }

}
