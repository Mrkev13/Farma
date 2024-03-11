public class Cow extends Animal{
    private String type;
    private String name;
    private Size size;
    private String specialCare;

    public Cow(String type, String name, Size size, String specialCare) {
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
