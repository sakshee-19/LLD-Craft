package head.first.remote.control;

public class SimpleRemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public SimpleRemoteControl(){
        onCommands = new Command[4];
        offCommands = new Command[4];
        undoCommand = new NoCommand();
    }

    public void onButtonPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];

    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void undo(){
        undoCommand.undo();
    }
}
