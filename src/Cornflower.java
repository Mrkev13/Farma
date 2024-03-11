public class Cornflower extends Flower{

    private double price;
    private double neededArea;
    private double chanceOfGrowth;

    public Cornflower(double price, double neededArea, double chanceOfGrowth) {
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Cornflower{" +
                "price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}

