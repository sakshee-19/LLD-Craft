package head.first.mvc.musicalbum;

public interface BeatModelInterface {
    void on();
    void off();
    void setBPM();
    void getBPM();
    void registerObserver(BeatObserver observer);
    void removeObserver(BeatObserver observer);
    void registerObserver(BPMObserver observer);
    void removeObserver(BPMObserver observer);
}
