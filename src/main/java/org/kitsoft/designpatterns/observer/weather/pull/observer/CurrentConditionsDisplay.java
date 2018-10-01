package org.kitsoft.designpatterns.observer.weather.pull.observer;

import org.kitsoft.designpatterns.observer.weather.pull.subject.Subject;
import org.kitsoft.designpatterns.observer.weather.pull.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElementImp {
	private float degree, humidity, pressures, windSpeed;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(Subject w) {
		WeatherData weatherData = (WeatherData)w;
		
		degree = weatherData.getDegree();
		humidity = weatherData.getHumidity();
		pressures = weatherData.getPressures();
		windSpeed = weatherData.getWindSpeed();
		
		display();
	}
	
	public void display() {
		System.out.println("Current conditions : " + degree
				+ "F degree and " + humidity + "% humidity");
	}
}
