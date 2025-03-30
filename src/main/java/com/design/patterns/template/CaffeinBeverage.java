package head.first.template;

public abstract class CaffeinBeverage {
    final public void prepare(){
        boilWater();
        brew();
        pourToCup();
        if(customerWantsCondiment()) {
            addCondiments();
        }
    }
    public abstract void brew();
    public abstract void addCondiments();

    // final concreates methods to not be overridden by subclass
    final public void boilWater(){
        System.out.println("Boiling Water");
    }

    final public void pourToCup(){
        System.out.println("Pour to cup");
    }

    public boolean customerWantsCondiment(){ // hook method with default implementation
        return true;
    }
}
