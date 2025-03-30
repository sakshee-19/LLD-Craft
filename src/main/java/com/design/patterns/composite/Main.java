package head.first.composite.patterns;

public class Main {
    public static void main(String[] args) {
        MenuComponent allMenu = new Menu("ALL Menus");
        Waitress waitress = new Waitress(allMenu);

        MenuComponent pancakeMenu = new Menu("Pancake House Menu");
        pancakeMenu.addComponent(new MenuItem("Pancake", "pancake breakfast", true, 150));
        pancakeMenu.addComponent(new MenuItem("Blueberry Pancake", " blueberry pancake breakfast", true, 200));
        pancakeMenu.addComponent(new MenuItem("waffles", "waffles breakfast", true, 170));

        MenuComponent dinner = new Menu("Dinner Menu");
        dinner.addComponent(new MenuItem("Veg BLT", "Bacon with lettus", true, 200));
        dinner.addComponent(new MenuItem("Burger", "Panner, Maharaja", true, 250));
        dinner.addComponent(new MenuItem("North Indian Thaali", "Roti, Paneer, raita", true, 350));
        dinner.addComponent(new MenuItem("Soup", "Soup of the Day", true, 120));

        MenuComponent cafe = new Menu("Cafe House Menu");
        cafe.addComponent(new MenuItem("Cold Coffee", "beverage", true, 150));
        cafe.addComponent(new MenuItem("Maggi", " veg healthy maggie", true, 80));
        cafe.addComponent(new MenuItem("Vadapav", "Vadapav", true, 35));

        MenuComponent dessert = new Menu("Dessert House Menu");
        dessert.addComponent(new MenuItem("Black Forest Pastry", "pastry", true, 80));
        dessert.addComponent(new MenuItem("Choco Truffle", " pastry", true, 80));
        dessert.addComponent(new MenuItem("vanilla", "ice-cream", true, 35));

        dinner.addComponent(dessert);

        allMenu.addComponent(pancakeMenu);
        allMenu.addComponent(cafe);
        allMenu.addComponent(dinner);

        waitress.printMenu();
        System.out.println("------------------");


    }
}
