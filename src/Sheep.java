public class Sheep extends Animal {

    private String name;
    private Size size;
    private String specialCare;

    public Sheep(String name, Size size, String specialCare) {
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
