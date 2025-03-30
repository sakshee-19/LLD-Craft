package head.first.collection.diner;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class WaitressMerger {
    private List<Menu> menuList;

    public WaitressMerger() {
//        this.dinersOgMenu = new DinersOgMenu(); // concreate impl of diner and pancake menu not interface
        this.menuList = List.of(new CafeMenu(), new DinersOgMenu(), new PancakeHouseMenu());
    }

    public void printMenu(){
        Iterator menus = menuList.iterator();
        while(menus.hasNext()){
            printMenu(((Menu)menus.next()).createIterator());
        }
    }

//    public void printMenu(){
//        Iterator dinnerMenu = dinersOgMenu.createIterator();
//        Iterator pancakeMenu = pancakeHouseMenu.createIterator();
//        Iterator cafeMenuIterator = cafeMenu.createIterator();
//        System.out.println("**********************");
//        System.out.println("BREAKFAST\n");
//        printMenu(pancakeMenu);
//        System.out.println("\n-------------------");
//        System.out.println("\nLUNCH\n");
//        printMenu(dinnerMenu);
//        System.out.println("\n-------------------");
//        System.out.println("\nSNACKS\n");
//        printMenu(cafeMenuIterator);
//        System.out.println("**********************");
//
//    }


    public void printMenu(Iterator menuIterator){
        while (menuIterator.hasNext()){
            printMenuItem((MenuItem) menuIterator.next());
        }
    }

    public void printVegManu(){

    }

    public void isVeg(String name){


    }

    public void printMenuItem(MenuItem menuItem){
        System.out.println(menuItem.getName()+"\t"+menuItem.getDescription()+"\t"+menuItem.isVeg()+"\t"+menuItem.getPrice());
    }
}
