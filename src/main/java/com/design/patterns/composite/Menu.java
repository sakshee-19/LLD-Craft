package head.first.composite.patterns;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    List<MenuComponent> menuComponents;
    private String name;

    public Menu(String name) {
        this.name = name;
        this.menuComponents = new ArrayList<>();
    }


    @Override
    public void addComponent(MenuComponent menuComponent){
        this.menuComponents.add(menuComponent);
    }


    @Override
    public void removeComponent(MenuComponent menuComponent){
        this.menuComponents.remove(menuComponent);
    }


    @Override
    public MenuComponent getChild(int i){
        return this.menuComponents.get(i);
    }


    @Override
    public void printMenu(){
        System.out.println("****************");
        System.out.println(name);
        System.out.println("--------------");
        for(MenuComponent menuComponent : menuComponents){
            menuComponent.printMenu();
//            System.out.println("********************\n\n");
        }
        System.out.println();
    }
}
