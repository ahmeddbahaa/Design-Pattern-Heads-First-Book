import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObservable(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            iterator.next().registerObservable(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            iterator.next().notifyObservers();
        }
    }
}
