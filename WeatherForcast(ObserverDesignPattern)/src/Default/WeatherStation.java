package Default;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData=new WeatherData();
		CurrentConditionDisplay observer1=new CurrentConditionDisplay(weatherData); 
		observer1.Display();
		weatherData.setMeasurments(100, 50, 10);
		//weatherData.measurmentsChanged();
		//weatherData.removeObserver(observer1);
		weatherData.setMeasurments(1.2f, 2.3f, 3.3f);

		//weatherData.measurmentsChanged();

	}

}
