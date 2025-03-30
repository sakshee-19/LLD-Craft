package head.first.remote.control;

public interface Command {
    public void execute();
    public void undo();
}
