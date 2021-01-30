import java.util.Scanner;

public class Task7 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Complex a = new Complex();
        Complex b = new Complex();
        Complex c = new Complex();
        System.out.println("请输入第一个复数的实部与虚部:");
        a.setReal(in.nextInt());
        a.setImaginary(in.nextInt());
        System.out.println("请输入第二个复数的实部与虚部:");
        b.setReal(in.nextInt());
        b.setImaginary(in.nextInt());
        System.out.println("两复数相加的结果为"+c.Add(a,b).toString());
        System.out.println("两复数相减的结果为"+c.Reduce(a,b).toString());
        System.out.println("两复数相乘的结果为"+c.Multiply(a,b).toString());
    }
}

class Complex{
    private int real;
    private int imag;
    public void setReal(int r){
        real = r;
    }
    public void setImaginary(int i){
        imag = i;
    }
    public int getReal(){
        return real;
    }

    public int getImag() {
        return imag;
    }

    Complex Add(Complex a, Complex b){
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;
        return c;
    }
    Complex Reduce(Complex a,Complex b){
        Complex c = new Complex();
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;
        return c;
    }
    Complex Multiply(Complex a,Complex b){
        Complex c = new Complex();
        c.real = a.real * b.real - a.imag * b.imag;
        c.imag = a.imag * b.real + a.real * b.imag;
        return c;
    }
    public String toString() {

        return " " + real  + "+" + imag + "i";
    }
}

