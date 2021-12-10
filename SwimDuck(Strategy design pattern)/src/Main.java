
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d=new ModelDuck();
		d.Display();
		d.Swim();
		d.Performfly();
		d.PerfomQuack();
		d.setFlyingBehaviour(new FlyWithWings());
		d.Performfly();
	}

}
