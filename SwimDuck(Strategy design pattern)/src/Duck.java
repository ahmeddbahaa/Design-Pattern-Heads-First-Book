
abstract public class Duck {
	 QuackBehaviour Quack;
	 FlyBehaviour Fly;
	 void Swim() {
		 System.out.println("all ducks swim");
	 }
	 void Performfly() {
		 Fly.fly();
	 }
	  void PerfomQuack() {
		  Quack.quack();
	  }
	  
	 abstract void Display();
	 
	 void setFlyingBehaviour(FlyBehaviour fly) {
		 Fly=fly;
	 }
	 void setQuackBehaviour(QuackBehaviour quack) {
		 Quack=quack;
	 }

}
