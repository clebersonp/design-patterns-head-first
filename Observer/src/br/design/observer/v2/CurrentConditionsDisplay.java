package br.design.observer.v2;

import br.design.display.DisplayElement;
import br.design.weather.v2.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private WeatherData weatherData;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(final WeatherData weatherData) {
		this.weatherData = weatherData;
		this.register();
	}

	/*
	 * Recuperando somente os dados que lhe interessar de weatherData, ou seja,
	 * fazendo um pull
	 */
	@Override
	public void update() {
		this.temperature = this.weatherData.getTemperature();
		this.humidity = this.weatherData.getHumidity();
		this.display();
	}

	@Override
	public void display() {
		System.out.println(
				String.format("Current conditions: %.1fF degrees and %.1f humidity", this.temperature, this.humidity));
	}

	@Override
	public void unregister() {
		this.weatherData.removeObserver(this);
	}

	@Override
	public void register() {
		this.weatherData.registerObserver(this);
	}

}
