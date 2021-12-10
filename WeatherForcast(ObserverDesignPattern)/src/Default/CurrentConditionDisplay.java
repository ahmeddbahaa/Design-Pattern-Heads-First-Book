package Default;

public class CurrentConditionDisplay implements Observer ,DisplayElements {
private	float temparture,Pressure,humidity;
private Subject weatherData;


public CurrentConditionDisplay(Subject weatherData) {

	// TODO Auto-generated constructor stub
	this.weatherData=weatherData;
weatherData.registerObserver(this);


}


	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("the CurrentConditionDisplay \n The Temprature:"
		+ " "+temparture+"\nThe Pressure is : "+Pressure+"The Humidity is :"+humidity);
		
	}

	@Override
	public void update(float temp, float pressure, float humadity) {
		// TODO Auto-generated method stub
		this.temparture=temp;
		this.Pressure=pressure;
		this.humidity=humadity;
		Display();
		
	}

}
