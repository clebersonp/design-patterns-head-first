package br.design.observer.v1;

import br.design.display.DisplayElement;
import br.design.weather.v1.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private WeatherData weatherData;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(final WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

	@Override
	public void display() {
		System.out.println(
				String.format("Current conditions: %.1fF degrees and %.1f humidity", this.temperature, this.humidity));
	}

}
