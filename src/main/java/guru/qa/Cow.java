package guru.qa;

public class Cow {

    String cow;
    String name;
    boolean kind;
    int age;
    boolean isGiveMilk;

    Cow() {
    }

    Cow(String cowColor, String name, int age, boolean kind,  boolean isGiveMilk) {
        this.cow = cowColor;
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.isGiveMilk = isGiveMilk;
    }

    void displayInfo() {
        System.out.println("Color " + cow + ", name " + name + ", sex " + kind + ", age " + age);
    }

    void displayInfoForZhora() {
        System.out.println("Cow name " + name + ", age cow " + age);
    }

    void answerTheHost() {
        System.out.println("Hello my dear host!");
        if (isGiveMilk) {
            System.out.println("I will give you milk");
        } else {
            System.out.println("I will not give you milk");
        }
    }

    void idOldAndKind() {
        if (age > 15 && kind) {
            System.out.println("I`m the best cow and kind old cow!");
        }
    }

}
