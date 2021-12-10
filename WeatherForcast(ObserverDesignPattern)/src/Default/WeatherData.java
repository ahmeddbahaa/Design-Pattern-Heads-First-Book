package Default;
import java.util.*;
/*Author 
 * 
 * Ahmed
 * 
 * */
public class WeatherData implements Subject {
	ArrayList<Observer> observers=new ArrayList<Observer>();
	float Temp,Pressure,Humidity;
	
//WeatherData is class that is subject and is notifying every observer "client" when weather changes
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i=observers.indexOf(o);
		if(i>=0)
			observers.remove(i);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer:observers) {
			observer.update(Temp, Pressure, Humidity);
		}
			
	}
	/*void getTemparture(float temp) {
		this.Temp=temp;
		
	}
	void getPressure(float pressure) {
		Pressure=pressure;		
		
	}
	void getHumadity(float humidity) {
		this.Humandity=humidity;
		
	}*/
	void measurmentsChanged() {
		notifyObserver();
	}
	void setMeasurments(float temp,float pressure,float humidity) {
		this.Temp=temp;
		this.Pressure=pressure;
		this.Humidity=humidity;
		measurmentsChanged();
		
	}
}
