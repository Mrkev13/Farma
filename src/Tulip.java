public class Tulip extends Flower{
    private double price;
    private double neededArea;
    private double chanceOfGrowth;

    public Tulip(double price, double neededArea, double chanceOfGrowth) {
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
