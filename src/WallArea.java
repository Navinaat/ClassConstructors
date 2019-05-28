public class WallArea
{
double width;
double height;
public WallArea()
{
}
     public WallArea(double width,double height)
    {
        if(width<0)
        {
            this.width = 0;
        }
        else if (height<0){
            this.height=0;
        }else if (width>0 && height>0){
            this.width=width;
            this.height=height;
        }
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWidth(double width)
    {
        if(width<0){
            this.width=0;
        }
        else
        {
            this.width=width;
        }
    }
    public void setHeight(double height){
    if(height<0){   this.height=0;
    }
    else
    {
        this.height=height;
    }
}
    public double getArea(){
    double result=width*height;
    return result;
}
    public static void main(String[] args){
    WallArea w1=new WallArea(8,6);
    System.out.println("area= "+w1.getArea());
    System.out.println("width ="+w1.getWidth());
    System.out.println("height = " +w1.getHeight());
}
}


