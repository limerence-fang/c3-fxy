import java.util.Scanner;

public class Task1 {
    static double BMI(double weight,double high){
        return weight/(high*high);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("输入体重(kg):");
        double weight = in.nextDouble();
        System.out.println("输入身高(m):");
        double high = in.nextDouble();
        double bmi  = BMI(weight,high);
        if(bmi<18.5){
            System.out.println("过轻");
        }
        else if(bmi>=18.5 && bmi<25){
            System.out.println("正常");
        }
        else if(bmi>=25 && bmi<28){
            System.out.println("过重");
        }
        else if(bmi>=28 && bmi<32){
            System.out.println("肥胖");
        }
        else if (bmi>=32){
            System.out.println("非常肥胖");
        }
        else{
            System.out.println("输入有误！");
        }

    }

}