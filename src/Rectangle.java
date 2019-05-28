public class Rectangle
{
    double Width;
    double Length;

    public Rectangle(double Width, double Length) {
        this.Width = Width;
        this.Length = Length;
        if (Width > 0) {
            this.Width = 0;
        }
        if (Length > 0) {
            this.Length = 0;

        } else {
            this.Length = Length;
        }
    }

    public double getWidth() {
        return Width;
    }

    public double getLength() {
        return Length;
    }

    public double getArea() {
        double area = Length * Width;
        return area;
    }
}

class Cuboid extends Rectangle
{
    double Height;

    public Cuboid(double Width, double Length,double Height) {
        super(Width, Length);
    }

    public double getHeight()
    {
        return Height;
    }
    public double getVolume()
    {
        double vol=(Length * Width)*Height;
        return vol;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7, 9);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.getArea());
        Cuboid cu = new Cuboid(7, 6, 9);
        System.out.println(cu.getVolume());
        System.out.println(cu.getWidth());
        System.out.println(cu.getLength());
        System.out.println(cu.getArea());
        System.out.println(cu.getHeight());

    }

}


