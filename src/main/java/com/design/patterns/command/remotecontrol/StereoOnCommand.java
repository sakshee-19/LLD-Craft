package head.first.remote.control;

public class StereoOnCommand implements Command{
    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setVolume();
    }

    @Override
    public void undo() {
        this.stereo.off();
    }
}
