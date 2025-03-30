package head.first.adapter;

public class GenTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble!! gobble!!");
    }

    @Override
    public void fly() {
        System.out.println("I fly short distance");
    }
}
