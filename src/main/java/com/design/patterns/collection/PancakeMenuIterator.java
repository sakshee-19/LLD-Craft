package head.first.collection.diner;

import java.util.Iterator;
import java.util.List;

public class PancakeMenuIterator implements Iterator<MenuItem> {
    List<MenuItem> menuItems;
    int size=0;
    int pos=0;

    public PancakeMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        size = menuItems.size();
    }

    @Override
    public boolean hasNext() {
        return pos < size;
    }

    @Override
    public MenuItem next() {
        if(pos<menuItems.size()){
            pos++;
            return menuItems.get(pos-1);
        }
        return null;
    }
}
