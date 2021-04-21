package Unit_9.Lesson_2.Activity_1;

public class SpecialityCoffee extends Coffee {

    // Additional member variable
    private String flavor;

    public SpecialityCoffee() {
        // Calls super-constructor to create default coffee then sets flavor
        super();
        flavor = "vanilla";
    }

    public SpecialityCoffee(String size, String type, String flavor) {
        // Calls constructor below with a mix of parameters and default values
        this(size, false, 1, type, flavor);
    }

    public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor) {
        // Calls super-constructor to set first 4 variables then sets flavor
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    @Override
    public int getPrice() {
        if (getSize().equals("large") || getSize().equals("extra large")) {
            return super.getPrice() + 70;
        } else {
            return super.getPrice() + 50;
        }
    }

    public String toString() {
        // Calls Coffee toString and appends flavor to end
        return super.toString() + " with " + flavor;
    }

}
