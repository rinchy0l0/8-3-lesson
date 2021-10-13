package guru.qa;

public class Main {

    public static void main(String[] args) {
        Cow liza = new Cow("Pink", "Liza",7,  true, true);
        liza.displayInfo();
        liza.answerTheHost();
        liza.idOldAndKind();

        Cow tom = new Cow();
        tom.cow = "Black";
        tom.name = "Tom";
        tom.kind = true;
        tom.age = 2;
        tom.isGiveMilk = true;
        tom.displayInfo();
        tom.answerTheHost();

        Cow zhora = new Cow("Blue", "Zhora", 3, true, false);
        zhora.displayInfoForZhora();
        zhora.answerTheHost();
    }
}