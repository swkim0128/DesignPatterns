package org.kitsoft.designpatterns.observer.weather.push;

import org.kitsoft.designpatterns.observer.weather.push.observer.CurrentConditionsDisplay;
import org.kitsoft.designpatterns.observer.weather.push.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
	
		weatherData.setMeasurements(80, 65, 30.4f, 40);
	}

}
