package org.kitsoft.designpatterns.observer.weather.push.subject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.kitsoft.designpatterns.observer.weather.push.observer.CurrentConditionsDisplay;

@RunWith(JUnitPlatform.class)
class WeatherDataTest {
	private WeatherData weatherData;
	private CurrentConditionsDisplay currentDisplay;
	
	@BeforeEach
	void setUp() throws Exception {
		weatherData = new WeatherData();
		currentDisplay = new CurrentConditionsDisplay(weatherData);
	}

	@Test
	void setMeasurementsTest() {
		weatherData.setMeasurements(10, 10, 10, 10);
		
		assertEquals(10.0, currentDisplay.getDegree());
		assertEquals(10, currentDisplay.getHumidity());
		assertEquals(10, currentDisplay.getPressures());
		assertEquals(11, currentDisplay.getWindSpeed());
	}

}
