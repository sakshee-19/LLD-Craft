package head.first.adapter;

public class TurkeyAdapter implements Duck { // turkey adapting to behave like duck
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();

    }

    @Override
    public void fly() {
        for(int i=0; i<5; ++i){
            turkey.fly();
        }
    }
}
