package head.first.adapter;

public class Main {
    public static void main(String[] args) {
        Duck d1 = new MallardDuck();
        d1.quack();
        d1.fly();
        d1 = new TurkeyAdapter(new GenTurkey());
        d1.quack();
        d1.fly();
    }

}
