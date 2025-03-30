package head.first.comound.pattern.oberserver;

public class Quackologist2 implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist2: "+duck+" just quacked");
    }
}
