public class Point {
    int X;
    int Y;

    public Point() {
    }

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    public double distance() {
        return Math.sqrt(((this.X- 0) * (this.X - 0)) + ((this.Y - 0) * (this.Y- 0)));
    }

    public double distance(int X, int Y) {
        return Math.sqrt(((this.X - X) * (this.X - X)) + ((this.Y - Y) * (this.Y - Y)));
    }

    public double distance(Point point) {
        return Math.sqrt(((this.X - point.X) * (this.X - point.X)) + ((this.X - point.Y) * (this.Y - point.Y)));
    }

    public static void main(String[] args) {
        Point first = new Point(7, 6);
        Point second = new Point(4, 2);
        System.out.println("distance(0,0)=" + first.distance());
        System.out.println("distance(second)=" + first.distance(second));
        System.out.println("distance(2,2)" + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()=" + point.distance());
    }
}


