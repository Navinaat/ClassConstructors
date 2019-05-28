public class Carpet
{
    double cost;

    public Carpet(double cost) {
        this.cost = cost;
        if (cost < 0) {
            this.cost = 0;
        }
        this.cost = cost;
    }

    public double getcost() {
        return cost;
    }
}
