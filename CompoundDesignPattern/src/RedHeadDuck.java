public class RedHeadDuck implements Quackable {
    Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Red head duck Quack");
        notifyObservers();
    }

    @Override
    public void registerObservable(Observer observer) {
        observable.registerObservable(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
