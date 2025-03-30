package head.first.collection.diner;

public class MenuItem {
    private String name;
    private String description;
    private boolean isVeg;
    private double price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public double getPrice() {
        return price;
    }

    public MenuItem(String name, String description, boolean isVeg, double price) {
        this.name = name;
        this.description = description;
        this.isVeg = isVeg;
        this.price = price;
    }


}
