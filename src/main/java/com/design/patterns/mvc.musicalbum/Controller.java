package head.first.mvc.musicalbum;

public interface Controller {
    void incBPM();
    void decBPM();
    void stop();
    void start();
    void setBpm(int n);

}
