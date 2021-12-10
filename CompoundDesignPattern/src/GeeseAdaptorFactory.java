public class GeeseAdaptorFactory extends AbstractGeeseFactory{
    @Override
    public Quackable createGeeseAdaptedToDucks() {
        return new GeeseAdaptor(new Geese());
    }
}
