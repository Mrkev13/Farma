public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Animal a1 = new Sheep("Pablo",Size.SMALL, "you must cut his wool");
        Animal a2 = new Cow("cow","Pablina",Size.BIG,"you must milk her");
        Cow cow = new Cow("cow", "Kokosina", Size.SMALL, "Idk");
        Flower f1 = new Snapdragon(1200,2,50);
        Farm.koupit(cow);

        System.out.println(farm);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(f1);
        Farm.pohladit(a2);
    }
}