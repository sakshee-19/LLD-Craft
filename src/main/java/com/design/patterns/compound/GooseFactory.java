package head.first.comound.pattern;

public class GooseFactory extends AbstractGooseFactory{
    @Override
    public Goose createGoose() {
        return new Goose();
    }
}
