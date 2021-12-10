public class CountingDuckFactory extends AbstractFactoryDuck {

    @Override
    public Quackable createMallodDuck() {
        return new QuackCounterDecorator(new MallodDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounterDecorator(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounterDecorator(new DuckCall());
    }
}
