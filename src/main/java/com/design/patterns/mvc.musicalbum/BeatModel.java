package head.first.mvc.musicalbum;

public class BeatModel implements BeatModelInterface{
    int currBpm;

    public BeatModel() {
        this.currBpm = 90;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM() {

    }

    @Override
    public void getBPM() {

    }

    @Override
    public void registerObserver(BeatObserver observer) {

    }

    @Override
    public void removeObserver(BeatObserver observer) {

    }

    @Override
    public void registerObserver(BPMObserver observer) {

    }

    @Override
    public void removeObserver(BPMObserver observer) {

    }
}
