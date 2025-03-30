package head.first.collection.diner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements  Menu{
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        addItem("Pancake", "pancake breakfast", true, 150);
        addItem("Blueberry Pancake", " blueberry pancake breakfast", true, 200);
        addItem("waffles", "waffles breakfast", true, 170);
    }

    public void addItem(String name, String desc, boolean veg, double price){
        MenuItem item = new MenuItem(name, desc, veg, price);
        menuItems.add(item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new PancakeMenuIterator(menuItems);
    }
}
