public class Snapdragon extends Flower{
    private double price;
    private double neededArea;
    private double chanceOfGrowth;

    public Snapdragon(double price, double neededArea, double chanceOfGrowth) {
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Snapdragon{" +
                "price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}


