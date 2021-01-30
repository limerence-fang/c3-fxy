import java.util.Scanner;

public class Task5 {
    public static void main(String args[]){
        System.out.println("请输入半径:");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        Circle C = new Circle(radius);
        System.out.println("the area is "+C.getArea());
        System.out.println("the perimeter is "+C.getPerimeter());
    }
}

class Circle{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area=0;
        area = Math.PI * radius * radius;
        return area;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}

