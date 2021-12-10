public class GeeseAdaptor implements Quackable{
    Geese geese;

    GeeseAdaptor(Geese geese)
    {
        this.geese = geese;
    }
    public void quack()
    {
        geese.honk();
    }

    @Override
    public void registerObservable(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
