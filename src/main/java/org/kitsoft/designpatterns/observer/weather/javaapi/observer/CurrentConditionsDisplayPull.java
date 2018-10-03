package org.kitsoft.designpatterns.observer.weather.javaapi.observer;

import java.util.Observable;
import java.util.Observer;

import org.kitsoft.designpatterns.observer.weather.javaapi.observable.WeatherData;

public class CurrentConditionsDisplayPull implements Observer {
	@SuppressWarnings("unused")
	private Observable observable;
	private float degree, humidity;
	
	public CurrentConditionsDisplayPull(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.degree = weatherData.getDegree();
			this.humidity = weatherData.getHumidity();			
		}
	}
	
	public void display() {
		System.out.println("Current conditions : " + degree
				+ "F degree and " + humidity + "% humidity");
	}
}
