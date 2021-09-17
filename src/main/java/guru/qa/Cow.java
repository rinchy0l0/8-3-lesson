package guru.qa;

public class Cow {

    String cowColor;
    String name;
    boolean kind;
    int age;
    boolean givesMilk;

    Cow(String a, String b, boolean t, int f) {
        cowColor = a;
        name = b;
        kind = t;
        age = f;
    }

    Cow() {
    }

    Cow(String name, int age, boolean givesMilk) {
        this.name = name;
        this.age = age;
        this.givesMilk = givesMilk;
    }

    void displayInfo() {
        System.out.println("Color " + cowColor + ", name " + name + ", sex " + kind + ", age " + age);
    }

    void displayInfoForZhora() {
        System.out.println("Cow name " + name + ", age cow " + age);
    }

    Cow milk() {
        System.out.println("Hello my dear host!");
        if (givesMilk) {
            System.out.println("I will give you milk");
        } else {
            System.out.println("I will not give you milk");
        }
        return this;
    }

    void oldCow() {
        if (age > 15 && kind) {
            System.out.println("I`m the best cow and kind old cow!");
        }
    }

}
