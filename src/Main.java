public class Main {
    public static void main(String[] args) {
        Animal a1 = new Sheep("Pablo",Size.SMALL, "you must cut his wool");
        Animal a2 = new Cow("Pablina",Size.BIG,"you must milk her");
        System.out.println(a1);
        System.out.println(a2);
    }
}