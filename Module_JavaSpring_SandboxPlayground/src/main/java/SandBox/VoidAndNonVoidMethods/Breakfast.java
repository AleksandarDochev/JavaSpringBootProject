package SandBox.VoidAndNonVoidMethods;

public class Breakfast {
    public Breakfast(String description, String extra, String drink) {
        this.description = description;
        this.extra = extra;
        this.drink = drink;
    }

    private String description;
    private String extra;
    private String drink;



    // Getter
    public String getDescription() {
        return description;
    }
    public String getExtra() {
        return extra;
    }
    public String getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return  description + extra + drink;
    }


}
