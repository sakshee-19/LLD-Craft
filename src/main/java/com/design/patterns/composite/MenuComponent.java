package head.first.composite.patterns;

public abstract class MenuComponent {

    public MenuComponent() {
    }

    public MenuComponent getChild(int child){
        throw  new UnsupportedOperationException();
    }

    public void addComponent(MenuComponent component){
        throw  new UnsupportedOperationException();
    }

    public void removeComponent(MenuComponent component){
        throw  new UnsupportedOperationException();
    }

    public void printMenu(){
        throw  new UnsupportedOperationException();
    }

}
