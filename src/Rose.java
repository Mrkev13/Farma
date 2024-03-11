public class Rose extends Flower{

    private double price;
    private double neededArea;
    private double chanceOfGrowth;

    public Rose(double price, double neededArea, double chanceOfGrowth) {
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}

