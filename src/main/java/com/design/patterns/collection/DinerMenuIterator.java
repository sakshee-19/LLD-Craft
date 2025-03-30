package head.first.collection.diner;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int size=0;
    int pos=0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        size = menuItems.length;
    }

    @Override
    public boolean hasNext() {
        return pos < size && menuItems[pos] != null;
    }

    @Override
    public MenuItem next() {
        if(pos<size){
            pos++;
            return menuItems[pos-1];
        }
        return null;
    }
}
