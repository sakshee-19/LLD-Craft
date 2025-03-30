package head.first.template;

public class Coffee extends CaffeinBeverage {

//    void prepareRecipe(){
//        boilWater();
//        brewCoffeeGrind();
//        pourToCup();
//        addSugarAndMilk();
//    }


    @Override
    public void brew(){
        System.out.println("Dripping Coffee through filter ");
    }

    @Override
    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }

}
