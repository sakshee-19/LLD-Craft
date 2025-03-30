package head.first.remote.control;

public class NoCommand implements Command{

    public NoCommand(){
    }

    @Override
    public void execute() {}

    @Override
    public void undo() {

    }
}
