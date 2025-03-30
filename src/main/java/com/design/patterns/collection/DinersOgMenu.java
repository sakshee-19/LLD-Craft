package head.first.collection.diner;

import java.util.ArrayList;
import java.util.List;

public class DinersOgMenu implements Menu{
    private MenuItem[] menuItems;
    private final int MAX_SIZE = 6;
    int size=0;

    public DinersOgMenu() {
        menuItems = new MenuItem[MAX_SIZE];
        addItem("Veg BLT", "Bacon with lettus", true, 200);
        addItem("Burger", "Panner, Maharaja", true, 250);
        addItem("North Indian Thaali", "Roti, Paneer, raita", true, 350);
        addItem("Soup", "Soup of the Day", true, 120);

    }

    public void addItem(String name, String desc, boolean veg, double price){
        MenuItem item = new MenuItem(name, desc, veg, price);
        if(size == MAX_SIZE){
            System.out.println("Capacity Full!!! cant add more");
            return;
        }
        menuItems[size] = item;
        size++;
    }

    @Override
    public DinerMenuIterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
