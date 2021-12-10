public class MallodDuck implements Quackable {
    Observable observable;

    public MallodDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Mallod Duck Quack");
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

    @Override
    public String toString() {
        return "MallodDuck";
    }
}
