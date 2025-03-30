package head.first.comound.pattern.oberserver;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
