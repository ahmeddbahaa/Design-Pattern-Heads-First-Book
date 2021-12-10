
public class ModelDuck  extends Duck{

	public ModelDuck(){
		super.Fly=new FlyNoway();
		super.Quack=new MuteQuack();
	}
	@Override
	void Display() {
		// TODO Auto-generated method stub
		System.out.println("Iam ModelDuck");
	}
	

}
