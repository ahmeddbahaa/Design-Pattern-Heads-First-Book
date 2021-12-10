public class DuckSimulator {

    public static void main(String[]args)
    {
        DuckSimulator simulator = new DuckSimulator();
        CountingDuckFactory factory = new CountingDuckFactory();
        GeeseAdaptorFactory geeseFactory = new GeeseAdaptorFactory();
        simulator.simulate(factory, geeseFactory);
    }
    private void simulate(Quackable duck) {
        duck.quack();
    }

    public void simulate(AbstractFactoryDuck factory, AbstractGeeseFactory geeseFactory)
    {
        Quackable duckCall = factory.createDuckCall();
        Quackable malledDuck = factory.createMallodDuck();
        Quackable redHeadDuck = factory.createRedHeadDuck();
        Quackable gooseAdaptor = geeseFactory.createGeeseAdaptedToDucks();
        Flock flockOfDucks = new Flock();

        flockOfDucks.add(duckCall);
        flockOfDucks.add(malledDuck);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(gooseAdaptor);

        Quackable duckCall1 = factory.createDuckCall();
        Quackable duckCall2 = factory.createDuckCall();
        Quackable duckCall3 = factory.createDuckCall();
        Quackable duckCall4 = factory.createDuckCall();
        Flock flockOfDuckCall = new Flock();

        flockOfDuckCall.add(duckCall1);
        flockOfDuckCall.add(duckCall2);
        flockOfDuckCall.add(duckCall3);
        flockOfDuckCall.add(duckCall4);

        flockOfDucks.add(flockOfDuckCall);

        System.out.println("Duck Simulator");

        Quackologist quackologist = new Quackologist(1);

        flockOfDucks.registerObservable(quackologist);

        System.out.println("Flock of Duck quack ");
        simulate(flockOfDuckCall);
        System.out.println(" ");

        System.out.println("Flock of All Duck quack");
        simulate(flockOfDucks);
        System.out.println(" ");
        //Test another observer to same Object
        Quackologist quackologist2 = new Quackologist(2);
        Quackologist quackologist3 = new Quackologist(3);
        malledDuck.registerObservable(quackologist2);
        malledDuck.registerObservable(quackologist3);

        simulate(malledDuck);
        System.out.println("Total number of Duck Quacks is "+ QuackCounterDecorator.getQuackCount()+" Times");
    }
}
