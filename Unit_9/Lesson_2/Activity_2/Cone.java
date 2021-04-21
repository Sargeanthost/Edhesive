package Unit_9.Lesson_2.Activity_2;

public class Cone {

    private String flavor;
    private boolean waffle;

    public Cone(String f, boolean w) {
        waffle = w;
        flavor = f;
    }

    public void setFlavor(String f) {
        flavor = f;
    }

    public String toString() {
        String s = "";
        if (waffle)
            s += "waffle ";
        s += "cone with " + flavor;
        return s;
    }

}
