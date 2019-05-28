public class ComplexOperation
{
    double real;
    double imaginary;

    public  ComplexOperation(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double x,double y){
        this.real=real+x;
        this.imaginary=imaginary+y;
    }
    public void add( ComplexOperation number)
    {
        this.real=real+number.real;
        this.imaginary=imaginary+number.imaginary;
    }
    public void sub(double x, double y){
        this.real=real-x;
        this.imaginary=imaginary-y;
    }
    public void sub( ComplexOperation number){
        this.real=real-number.real;
        this.imaginary=imaginary-number.imaginary;
    }
    public static void main(String[] args)
    {
        ComplexOperation c1= new ComplexOperation(1.0,1.0);
        ComplexOperation c2= new ComplexOperation(2.5,3.2);
        c1.add(1,2);
        System.out.println("one.real = "+c1.getReal());
        System.out.println("one.imaginary="+c1.getImaginary());
        c1.sub(c2);
        System.out.println("one.real = "+c1.getReal());
        System.out.println("one.imaginary="+c1.getImaginary());
        c2.sub(c1);
        System.out.println("number.real="+c2.getReal());
        System.out.println("number.imaginary="+c2.getImaginary());
    }
}

