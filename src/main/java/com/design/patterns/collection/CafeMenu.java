package head.first.collection.diner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CafeMenu implements  Menu {
    private Map<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new HashMap<>();
        addItem("Cold Coffee", "beverage", true, 150);
        addItem("Maggi", " veg healthy maggie", true, 80);
        addItem("Vadapav", "Vadapav", true, 35);
    }

    public void addItem(String name, String desc, boolean veg, double price){
        MenuItem item = new MenuItem(name, desc, veg, price);
        menuItems.put(name, item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator(); // java collection inbuilt iterator
    }
}
