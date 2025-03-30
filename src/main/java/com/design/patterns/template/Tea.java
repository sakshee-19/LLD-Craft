package head.first.template;

public class Tea extends CaffeinBeverage {

//    void prepareRecipe(){
//        boilWater();
//        steppingTea();
//        pourToCup();
//        addLemon();
//    }


    @Override
    public void brew(){
        System.out.println("Stepping the Tea");
    }

    @Override
    public void addCondiments(){
        System.out.println("Adding lemon");
    }

}
