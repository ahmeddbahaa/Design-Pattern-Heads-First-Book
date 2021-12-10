public interface QuackObservable {
     void registerObservable(Observer observer);
     void notifyObservers();
}
