package head.first.composite.patterns;

public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private boolean isVeg;
    private double price;

    public MenuItem(String name, String description, boolean isVeg, double price) {
        this.name = name;
        this.description = description;
        this.isVeg = isVeg;
        this.price = price;
    }

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

    @Override
    public void printMenu(){
        System.out.print(name+"\t");
        if(isVeg){
            System.out.print("veg\t");
        } else {
            System.out.print("non-veg\t");
        }
        System.out.println(price+"\t -- "+description);
    }
}
