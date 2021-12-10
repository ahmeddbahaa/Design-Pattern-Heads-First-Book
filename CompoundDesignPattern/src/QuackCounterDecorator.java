public class QuackCounterDecorator implements Quackable{
    Quackable duck;
    private static int quackCount = 0;
    QuackCounterDecorator(Quackable duck)
    {
        this.duck = duck;
    }
    public void quack()
    {
        duck.quack();
        quackCount++;
    }
    static int getQuackCount()
    {
        return quackCount;
    }

    @Override
    public void registerObservable(Observer observer) {
        duck.registerObservable(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
