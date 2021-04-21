package Unit_9.Lesson_2.Activity_2;

public class DoubleCone extends Cone {

    String f2;

    public DoubleCone(String f, boolean w) {
        super(f, w);
        f2 = f;
    }

    public DoubleCone(String f1, String f2, boolean w) {

        super(f1, w);
        this.f2 = f2;

    }

    public void setFlavor(String f) {
        super.setFlavor(f);
        this.f2 = f;
    }

    public void setFlavor(String f1, String f2) {
        super.setFlavor(f1);
        this.f2 = f2;
    }

    public String toString() {
        return "double " + super.toString() + " and " + f2;
    }
}