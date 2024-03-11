import java.util.List;

public class Farm {
    static List<Animal> zvirata;
    List<Flower> rostlina;
    public void zasadit(){}
    public void zavlazit(){}
    public void sklizet(){}

    public static void koupit(Animal animal){
        zvirata.add(animal);
        System.out.println("Koupil jste: " + animal.name);
    }

    public static void pohladit(Animal animal){
        System.out.println("Pohladil si " + animal.type + " ktere se jmenuje " + animal.name);
    }




}

