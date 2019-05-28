
public class SumCalculator
     {
        double FirstNumber;
        double SecondNumber;


    public double getFirstNumber()
    {
        return FirstNumber;
    }

    public void setFirstNumber(double FirstNumber) {
        this.FirstNumber=FirstNumber;
    }

    public double getSecondNumber()
    {
        return SecondNumber;
    }
    public void setSecondNumber(double SecondNumber)
    {
        this.SecondNumber=SecondNumber;
    }
    public double getAdditionResult()
    {
        double f1=FirstNumber+SecondNumber;
return f1;
    }
    public double getSubractionResult()
    {
        double f2=SecondNumber-FirstNumber;
return f2;
    }
    public double getMultiplicationResult()
    {
        double f3=FirstNumber*SecondNumber;
return f3;
    }

    public double getDivisionResult()
    {
        double f4=FirstNumber/SecondNumber;
        if (SecondNumber==0)
        {
           return 0;
        }

return f4;
    }

}

class MainClass
{
    public static void main(String[] args)
    {
        SumCalculator s1=new SumCalculator();
        s1.setFirstNumber(6.2);
        s1.setSecondNumber(8.7);


        System.out.println("Addition="+s1.getFirstNumber());
        System.out.println("Subraction="+s1.getSecondNumber());
        System.out.println("Multiplication="+s1.getFirstNumber());
        System.out.println("Division="+s1.getSecondNumber());
    }
}
