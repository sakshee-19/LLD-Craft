package head.first.adapter;

public class MallardDuck implements Duck{

    public MallardDuck() {
    }

    @Override
    public void quack() {
        System.out.println("Quack!! Quack !!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
