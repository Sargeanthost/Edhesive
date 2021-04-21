package Unit_9.Lesson_3;

public class Animal {
    private String name;

    public Animal(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "";
    }

    public String toString() {
        return getName() + " (" + speak() + " " + speak() + ").";
    }

}