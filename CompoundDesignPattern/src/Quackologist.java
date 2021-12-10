public class Quackologist implements Observer{
    int i = 0;
    public Quackologist(int i )
    {
        this.i = i;
    }

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist : "+i+" "+ duck.toString() +" Quacked");
    }
}
