package guru.qa;

public class Main {

    public static void main(String[] args) {
        Cow liza = new Cow("Pink", "Liza", true, 6);
        liza.displayInfo();
        liza.milk();
        liza.oldCow();

        Cow tom = new Cow();
        tom.cowColor = "Black";
        tom.name = "Tom";
        tom.kind = true;
        tom.age = 1;
        tom.givesMilk = true;
        tom.displayInfo();
        tom.milk();

        Cow zhora = new Cow("Zhora", 2, true);
        zhora.displayInfoForZhora();
        zhora.milk();
    }
}