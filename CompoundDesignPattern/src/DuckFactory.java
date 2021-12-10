public class DuckFactory extends AbstractFactoryDuck{
    @Override
    public Quackable createMallodDuck() {
        return new MallodDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }
}
