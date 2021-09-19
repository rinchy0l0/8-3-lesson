package guru.qa;

public class Main {

    public static void main(String[] args) {
        Cow liza = new Cow("Pink", "Liza",6,  true, true);
        liza.displayInfo();
        liza.answerTheHost();
        liza.idOldAndKind();

        Cow tom = new Cow();
        tom.cow = "Black";
        tom.name = "Tom";
        tom.kind = true;
        tom.age = 1;
        tom.isGiveMilk = true;
        tom.displayInfo();
        tom.answerTheHost();

        Cow zhora = new Cow("Blue", "Zhora", 2, true, false);
        zhora.displayInfoForZhora();
        zhora.answerTheHost();
    }
}